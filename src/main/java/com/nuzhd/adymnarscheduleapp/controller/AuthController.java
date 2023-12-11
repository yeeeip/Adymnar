package com.nuzhd.adymnarscheduleapp.controller;

import com.nuzhd.adymnarscheduleapp.dto.LoginForm;
import com.nuzhd.adymnarscheduleapp.model.AppUser;
import com.nuzhd.adymnarscheduleapp.model.MyNotification;
import com.nuzhd.adymnarscheduleapp.service.AppUserService;
import com.nuzhd.adymnarscheduleapp.service.NotificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AppUserService appUserService;
    private final NotificationService notificationService;

    public AuthController(AppUserService appUserService, NotificationService notificationService) {
        this.appUserService = appUserService;
        this.notificationService = notificationService;
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm("", ""));
        return "login";
    }

    @PostMapping("/login")
    public String signIn(LoginForm loginForm, RedirectAttributes redirectAttributes) {
        AppUser user = appUserService.findByLogin(loginForm.login());
        if (user != null) {
            if (loginForm.password().equals(user.getPassword())) {
                List<MyNotification> notifications = notificationService.findAll();
                redirectAttributes.addFlashAttribute("appUser", user);
                redirectAttributes.addFlashAttribute("notifications", notifications);
                return "redirect:/api/v1/schedule";
            } else {
                return "redirect:login?invalid";
            }
        } else {
            return "redirect:login?error";
        }
    }
}
