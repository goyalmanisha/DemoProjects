package com.ttn.mongodemo.service;

import com.ttn.mongodemo.co.StudentCO;
import com.ttn.mongodemo.controller.CRUDController;
import com.ttn.mongodemo.entity.Student;
import com.ttn.mongodemo.repository.CRUDRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

@Service
public class CRUDServiceImpl implements CRUDService {

    private static final Logger log = LogManager.getLogger(CRUDServiceImpl.class);


    @Autowired
    CRUDRepository crudRepository;

    @Override
    public Student create(StudentCO studentCO) {

        Student student = new Student();
        student.setStudentId(studentCO.getStudentId());
        student.setName(studentCO.getName());
        student.setAge(studentCO.getAge());
        student.setCourse(studentCO.getCourse());
        crudRepository.save(student);
        return student;
    }

    public Student read(Long studentId) {
        Student student = new Student();
        if(Objects.isNull(studentId)){
            log.error("Student Id not found");
        }
        try {
            student = crudRepository.findByStudentId(studentId);
            return student;
        }catch (Exception e){
            log.error("Exception occured",e);
        }
        return student;
    }

    @Override
    public Student delete(StudentCO studentCO) {
        return null;
    }

    @Override
    public Student update(StudentCO studentCO) {
        Student student = crudRepository.findByStudentId(studentCO.getStudentId());
        student.setAge(studentCO.getAge());
        student.setCourse(studentCO.getCourse());
        student.setName(studentCO.getName());
        return student;
    }
}
