package com.example.student_management_system.service;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repo;

    private static final Logger logger =
            LoggerFactory.getLogger(StudentServiceImpl.class);

    public List<Student> getAllStudents() {
        logger.info("Fetching all students: {}", repo.findAll());// debug
        return repo.findAll();
    }

    public Student addStudent(Student student) {
//        student.setCreatedDate(LocalDateTime.now());
        return repo.save(student);
    }

    public Student updateStudent(int id, Student student) {
        Student s = repo.findById(id).orElseThrow();
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        s.setAge(student.getAge());
        s.setCourse(student.getCourse());

        return repo.save(s);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
