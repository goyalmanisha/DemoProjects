package com.ttn.mongodemo.co;

import java.util.ArrayList;

public class StudentCO {

    private String name;
    private Long studentId;
    private int age;
    private ArrayList<String> course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<String> course) {
        this.course = course;
    }
}
