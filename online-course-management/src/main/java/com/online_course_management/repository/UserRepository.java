package com.online_course_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online_course_management.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

