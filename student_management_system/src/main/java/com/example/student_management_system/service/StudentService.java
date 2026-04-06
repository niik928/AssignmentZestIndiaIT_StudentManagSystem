package com.example.student_management_system.service;

import com.example.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student addStudent(Student student);
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);
}
