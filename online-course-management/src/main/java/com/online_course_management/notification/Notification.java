package com.online_course_management.notification;

import com.online_course_management.model.User;

public interface Notification {
    void notifyUser(User user, String message);
}
