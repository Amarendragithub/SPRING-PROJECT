package com.example.restapiexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class StudentServiceImpl023 implements StudentService023 {
        private StudentRepository23 studentRepository068;

        @Autowired
        public StudentServiceImpl023(StudentRepository23 studentRepository068) {
            this.studentRepository068 = studentRepository068;
        }

        @Override
        public Student23 saveStudent(Student23 student068) {
            return studentRepository068.save(student068);
        }

        @Override
        public List<Student23> getAllStudents() {
            return  studentRepository068.findAll();
        }

        @Override
        public Student23 getStudentById(long id) {
            Optional<Student23> student068=studentRepository068.findById(id);
        /*if (employee.isPresent()){
            return employee.get();
        }else {
            throw new ResourceNotFoundException("Employee", "id", id);
        }*/
            return studentRepository068.findById(id).orElseThrow(()->
                    new ResourceNotFoundException023("Student","id",id));
        }

        @Override
        public Student23 updateStudent(Student23 student068, long id) {
            //Check if the employee exists in the database
            Student23 existingStudent=studentRepository068.findById(id).orElseThrow(
                    ()->new ResourceNotFoundException023("Employee","Id",id));


            existingStudent.setStudentName(student068.getStudentName());
            existingStudent.setAdress(student068.getAdress());
            existingStudent.setPinCode(student068.getPinCode());
            existingStudent.setCoursesRegistered(student068.getCoursesRegistered());
            existingStudent.setContactNumber(student068.getContactNumber());
            studentRepository068.save(existingStudent);

            return existingStudent;
        }

        @Override
        public void deleteStudent(long id) {
            //check whether employee exist in the database or not
            studentRepository068.findById(id).orElseThrow(
                    ()->new ResourceNotFoundException023("Student","id",id));

            studentRepository068.deleteById(id);
        }
    }


