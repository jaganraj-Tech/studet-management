package com.example.mainproject.Controller;

import com.example.mainproject.Model.Student;
import com.example.mainproject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:63342") // 👈 Add this
public class StudentController {
    @Autowired
    StudentService StudentService;
    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        System.out.println("Received Student: " + student);
        return ResponseEntity.ok("Student created successfully!");
    }


    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return StudentService.getAllStudent();

    }
    @GetMapping("/student/{rollNo}")
    public Student getStudentbyRollNo(@PathVariable("rollNo") int rollNo){
        return StudentService.getStudentbyRollNo(rollNo);

    }
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
        StudentService.addstudent(student);
        return "Added Successfully";
    }
    @PutMapping("/student")
    public String updateStudent (@RequestBody Student student){
        StudentService.updatestudent(student);
        return "Updated Successfully";
    }
    @DeleteMapping("/student/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo){
        StudentService.deletestudent(rollNo);
        return "Deleted Successfully";
    }
    @DeleteMapping("/student/clear")
    public String clearStudent(){
        StudentService.clearstudent();
        return "All Deleted Successfully";
    }
}
