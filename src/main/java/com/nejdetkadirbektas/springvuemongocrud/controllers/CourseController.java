package com.nejdetkadirbektas.springvuemongocrud.controllers;

import com.nejdetkadirbektas.springvuemongocrud.models.Course;
import com.nejdetkadirbektas.springvuemongocrud.repositories.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author nejdetkadirr
 */
@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:8080")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getListOfCourses() {
        return ResponseEntity.ok(courseRepository.findAll());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<Course>> getCourse(@PathVariable("id") String id) {
        return ResponseEntity.ok(courseRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return ResponseEntity.ok(courseRepository.save(course));
    }

    @PutMapping
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        return ResponseEntity.ok(courseRepository.save(course));
    }
}
