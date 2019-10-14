package com.ttn.mongodemo.service;

import com.ttn.mongodemo.co.StudentCO;
import com.ttn.mongodemo.entity.Student;

public interface CRUDService {

    Student create(StudentCO studentCO);
    Student read (Long studentId);
    Student delete (StudentCO studentCO);
    Student update (StudentCO studentCO);

}
