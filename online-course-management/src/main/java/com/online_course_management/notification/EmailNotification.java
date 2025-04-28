package com.online_course_management.notification;

import org.springframework.stereotype.Service;

import com.online_course_management.model.User;

@Service
public class EmailNotification implements Notification {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Sending Email to " + user.getEmail() + ": " + message);
    }

	
}
