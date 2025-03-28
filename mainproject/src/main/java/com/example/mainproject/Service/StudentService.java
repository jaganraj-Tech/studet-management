package com.example.mainproject.Service;

import com.example.mainproject.Model.Student;
import com.example.mainproject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository StudentRepository;

    public List<Student> getAllStudent() {
        return StudentRepository.findAll();
    }

    public Student getStudentbyRollNo(int rollNo) {
        return StudentRepository.findById(rollNo).orElse(new Student());
    }


    public void addstudent(Student student) {
        StudentRepository.save(student);
    }

    public void updatestudent(Student student) {
        StudentRepository.save(student);
    }

    public void deletestudent(int rollNo) {


        StudentRepository.deleteById(rollNo);
    }

    public void clearstudent() {
        StudentRepository.deleteAll();
    }
}
