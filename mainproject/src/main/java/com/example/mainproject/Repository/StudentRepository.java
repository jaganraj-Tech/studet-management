package com.example.mainproject.Repository;

import com.example.mainproject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByplacedCompany(String placedCompany);
}
