package com.example.student_management_system.controller;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll(){
        return service.getAllStudents();

    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return service.addStudent(s);
    }

//    @PutMapping("/{id}")
//    public Student update(@PathVariable int id, @RequestBody Student s) {
//        return service.updateStudent(id, s);
//    }
@PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) {
    System.out.println("🔥 UPDATE API HIT - ID: " + id);
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.deleteStudent(id);
        return "Deleted";
    }

//
//    @GetMapping
//    public String test() {
//        return "Working";
//    }
}
