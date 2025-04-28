package com.online_course_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_course_management.model.Course;
import com.online_course_management.model.Student;
import com.online_course_management.repository.CourseRepository;
import com.online_course_management.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    public void enrollStudent(Long studentId, Long courseId) {
        Student student = (Student) userRepository.findById(studentId).orElseThrow();
        Course course = courseRepository.findById(courseId).orElseThrow();
        student.getEnrolledCourses().add(course);
        userRepository.save(student);
    }
}

