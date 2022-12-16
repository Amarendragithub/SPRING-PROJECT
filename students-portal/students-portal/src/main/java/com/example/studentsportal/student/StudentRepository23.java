package com.example.studentsportal.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository23 extends JpaRepository<Student23,Long> {
    String getStudentName();
}
