package com.online_course_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_course_management.model.User;
import com.online_course_management.notification.Notification;

@Service
public class NotificationService {
    @Autowired
    private Notification notification;  // inject different types as needed

    public void sendNotification(User user, String message) {
        notification.notifyUser(user, message);
    }
}

