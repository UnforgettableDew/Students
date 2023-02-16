package com.example.student.entity;

import javax.persistence.*;

public class Details {
    private Long id;
    private Long studentId;
    private Integer dormNumber;
    private Float entryPoint;
    private String faculty;

    public Details() {

    }

    public Details(Long studentId, Integer dormNumber, Float entryPoint, String faculty) {
        this.studentId = studentId;
        this.dormNumber = dormNumber;
        this.entryPoint = entryPoint;
        this.faculty = faculty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getDormNumber() {
        return dormNumber;
    }

    public void setDormNumber(Integer dormNumber) {
        this.dormNumber = dormNumber;
    }

    public Float getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(Float entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", dormNumber=" + dormNumber +
                ", entryPoint=" + entryPoint +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
