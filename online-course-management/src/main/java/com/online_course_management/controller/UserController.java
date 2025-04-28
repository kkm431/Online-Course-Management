package com.online_course_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.online_course_management.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{studentId}/enroll/{courseId}")
    public void enrollStudent(@PathVariable Long studentId, @PathVariable Long courseId) {
        userService.enrollStudent(studentId, courseId);
    }
}

