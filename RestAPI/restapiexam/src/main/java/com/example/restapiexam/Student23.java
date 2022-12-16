package com.example.restapiexam;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="students")
public class Student23 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "student_name",nullable = false)
    private String studentName;

    @Column(name = "address")
    private String adress;

    @Column(name = "pincode")
    private String pinCode;

    @Column(name = "courses_registered")
    private String coursesRegistered;

    @Column(name = "contact_Number")
    private String contactNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCoursesRegistered() {
        return coursesRegistered;
    }

    public void setCoursesRegistered(String coursesRegistered) {
        this.coursesRegistered = coursesRegistered;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

