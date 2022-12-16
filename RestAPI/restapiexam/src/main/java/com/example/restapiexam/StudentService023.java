package com.example.restapiexam;

import java.util.List;

public interface StudentService023 {
    Student23 saveStudent(Student23 student068);
    List<Student23> getAllStudents();
    Student23 getStudentById(long id);
    Student23 updateStudent(Student23 student068, long id);
    void deleteStudent(long id);
}

