package com.ttn.mongodemo.dto;

import java.util.List;

public class StudentDto {

    private String name;
    private Long studentId;
    private int age;
    private List<String> course;

    public StudentDto() {
    }

    public StudentDto(String name, Long studentId, int age, List<String> course) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long id) {
        this.studentId = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", id=" + studentId +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
