package com.example.studentsportal.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController23 {
    private StudentService23 studentService23;

    @Autowired
    public StudentController23(StudentService23 studentService23) {
        this.studentService23 = studentService23;
    }

    @PostMapping
    public ResponseEntity<Student23> saveStudent23(@RequestBody Student23 student23) {
        return new
                ResponseEntity<Student23>(studentService23.saveStudent23(student23),
                HttpStatus.CREATED);
    }

    @GetMapping
    public List<StudentService23> getAllStudents() {
        return studentService23.getAllStudents();
    }

    @GetMapping("{Id}")
    public ResponseEntity<Student23> getStudentById(@PathVariable("Id") Long studentId) {
        return new ResponseEntity<Student23>((Student23) studentService23.getStudentById(studentId),
                HttpStatus.OK);
    }
}