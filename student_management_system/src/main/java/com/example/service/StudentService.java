//package com.example.service;
//
//import com.example.entity.Student;
//
//import java.util.List;
//
//public interface StudentService {
//
//    List<Student> getAllStudents();
//    Student getStudentId(int id);
//    Student addStudent(Student student);
//    Student updateStudent(int id , Student student);
//    void deleteStudent(int id);
//}
package com.example.service;

import com.example.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
}