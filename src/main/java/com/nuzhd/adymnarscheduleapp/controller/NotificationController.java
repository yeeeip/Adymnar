package com.nuzhd.adymnarscheduleapp.controller;

import com.nuzhd.adymnarscheduleapp.dto.NotificationForm;
import com.nuzhd.adymnarscheduleapp.model.MyNotification;
import com.nuzhd.adymnarscheduleapp.service.NotificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public String getNotificationCreationPage(Model model) {
        model.addAttribute("notification", new NotificationForm(""));
        return "notification";
    }

    @PostMapping
    public String getNotificationCreationPage(NotificationForm notification, RedirectAttributes redirectAttributes) {
        System.out.println(notificationService.save(new MyNotification(notification.content())));
        List<MyNotification> notifications = notificationService.findAll();
        System.out.println(notifications);
        redirectAttributes.addFlashAttribute("notifications", notifications);
        return "redirect:/api/v1/schedule";
    }
}
