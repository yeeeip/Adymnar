package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.MyNotification;
import com.nuzhd.adymnarscheduleapp.repo.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<MyNotification> findAll() {
        return notificationRepository.findAll();
    }

    public MyNotification save(MyNotification myNotification) {
        return notificationRepository.save(myNotification);
    }
}
