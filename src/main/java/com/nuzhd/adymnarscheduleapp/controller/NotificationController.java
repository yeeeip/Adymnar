package com.nuzhd.adymnarscheduleapp.controller;

import com.nuzhd.adymnarscheduleapp.model.AppUser;
import com.nuzhd.adymnarscheduleapp.model.MyNotification;
import com.nuzhd.adymnarscheduleapp.service.NotificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public String getNotificationCreationPage(Model model) {
        model.addAttribute("notification", new MyNotification());
        return "notification";
    }

    @PostMapping
    public String getNotificationCreationPage(MyNotification myNotification, Model model) {
        notificationService.save(myNotification);
        return "redirect:/api/v1/schedule";
    }
}
