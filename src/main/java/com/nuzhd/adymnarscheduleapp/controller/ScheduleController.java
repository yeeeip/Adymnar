package com.nuzhd.adymnarscheduleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;

@Controller
@RequestMapping("/api/v1/schedule")
public class ScheduleController {

    @GetMapping
    public String getSchedule(Model model) {
        return "schedule";
    }
}
