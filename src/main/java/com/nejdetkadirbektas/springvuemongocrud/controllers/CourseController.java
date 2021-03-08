package com.nejdetkadirbektas.springvuemongocrud.controllers;

import com.nejdetkadirbektas.springvuemongocrud.models.Course;
import com.nejdetkadirbektas.springvuemongocrud.repositories.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nejdetkadirr
 */
@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getListOfCourses() {
        return ResponseEntity.ok(courseRepository.findAll());
    }
}
