package com.example.student_management_system.repository;

import com.example.student_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Integer> {

    Optional<User> findByUsername(String username);
}
