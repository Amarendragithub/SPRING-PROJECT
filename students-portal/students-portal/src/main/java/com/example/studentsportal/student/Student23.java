package com.example.studentsportal.student;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "student")

public class Student23 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "studentName",nullable = false)
    private String studentName;


    @Column(name = "address")
    private String address;


    @Column(name = "pincode")
    private String pincode;


    @Column(name = "course_Registered")
    private String courseRegistered;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCourseRegistered() {
        return courseRegistered;
    }

    public void setCourseRegistered(String courseRegistered) {
        this.courseRegistered = courseRegistered;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}

