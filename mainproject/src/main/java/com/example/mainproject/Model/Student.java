package com.example.mainproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Student {
    @Id
    private int rollNo;
    private String Name;
    private String placedCompany;
    private String salaryPackage;

    }

