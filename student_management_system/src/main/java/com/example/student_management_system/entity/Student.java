package com.example.student_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private int age;
    private String course;

    @Column(name = "created_date")
    private LocalDateTime createdDate;


    @PrePersist
    private void onCreate() {
        this.createdDate = LocalDateTime.now();
    }

}
