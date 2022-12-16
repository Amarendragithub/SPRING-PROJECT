package com.example.restapiexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController23 {
    private StudentService023 studentService068;

    @Autowired
    public StudentController23(StudentService023 studentService068) {
        this.studentService068 = studentService068;
    }

    //create employees REST API
    @PostMapping
    public ResponseEntity<Student23> saveStudent(@RequestBody Student23 student068){
        return new ResponseEntity<Student23>(studentService068.saveStudent(student068), HttpStatus.CREATED);
    }

    //code get all employees REST API
    @GetMapping
    public List<Student23> getAllStudents(){
        return  studentService068.getAllStudents();

    }

    //Build  get employee by ID REST API
    @GetMapping("{id}")
    public ResponseEntity<Student23> getStudentById(@PathVariable("id") long studentId){
        return new ResponseEntity<Student23>(studentService068.getStudentById(studentId),HttpStatus.OK);
    }

    //Build UpdateEmployee REST API
    @PutMapping("{id}")
    public ResponseEntity<Student23> updateStudent(@PathVariable("id") long id,
                                                   @RequestBody Student23 student068){
        return new ResponseEntity<Student23>(studentService068.updateStudent(student068,id),HttpStatus.OK);

    }

    //Build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        studentService068.deleteStudent(id);
        return new ResponseEntity<String>("Student deleted Successfully !",HttpStatus.OK);
    }


}

