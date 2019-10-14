package com.ttn.mongodemo.controller;

import com.ttn.mongodemo.co.StudentCO;
import com.ttn.mongodemo.entity.Student;
import com.ttn.mongodemo.service.CRUDService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/student")
public class CRUDController {

    private static final Logger log = LogManager.getLogger(CRUDController.class);

    @Autowired
    private CRUDService crudService;

    @PostMapping("/save")
    public Student create(@RequestBody StudentCO studentCO) {
        log.info("Request :: Registering the student");
        return crudService.create(studentCO);
    }

    @GetMapping("/read")
    public Student read(@RequestParam("studentId") Long studentId ){
        log.info("Request :: Get the student");
        return crudService.read(studentId);
    }

    @PostMapping("/update")
    public Student update(@RequestBody StudentCO studentCO){
        log.info("Request :: Get the student");
        return crudService.update(studentCO);
    }

}
