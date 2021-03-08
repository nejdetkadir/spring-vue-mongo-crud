package com.nejdetkadirbektas.springvuemongocrud.repositories;

import com.nejdetkadirbektas.springvuemongocrud.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author nejdetkadirr
 */
public interface CourseRepository extends MongoRepository<Course, String> {
}
