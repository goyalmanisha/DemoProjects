package com.ttn.mongodemo.repository;

import com.ttn.mongodemo.entity.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDRepository extends MongoRepository<Student, ObjectId> {

    Student findByStudentId(Long studentId);
}
