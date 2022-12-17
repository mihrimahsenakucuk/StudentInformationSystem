package com.example.Obs.Entity;

import com.example.Obs.Repository.ExamResultRepository;
import com.example.Obs.Service.ExamResultService;
import jakarta.persistence.*;

@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;
    @Column(name="full_Name")
    private String fullName;
    @Column(name = "number")
    private int number;
    @Column(name="email")
    private String email;
    @Column(name="gsm_Number")
    private int gsmNumber;
    @Column(name="average")
    private int average;

    public Student() {
    }

    public Student(int id, String fullName, int number, String email, int gsmNumber, int average) {
        this.id = id;
        this.fullName = fullName;
        this.number = number;
        this.email = email;
        this.gsmNumber = gsmNumber;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGsmNumber() {
        return gsmNumber;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setGsmNumber(int gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

}
