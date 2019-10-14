package com.ttn.mongodemo.entity;

import com.ttn.mongodemo.dto.StudentDto;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "student")
public class Student extends StudentDto {

    @Id
    private ObjectId id;
    @CreatedDate
    private Date registeredDate;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
}
