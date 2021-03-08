package com.nejdetkadirbektas.springvuemongocrud.controllers;

import com.nejdetkadirbektas.springvuemongocrud.models.Course;
import com.nejdetkadirbektas.springvuemongocrud.repositories.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
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

    @DeleteMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") String id, HttpServletResponse response) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            response.setStatus(200);
        } else {
            response.setStatus(500);
        }
    }
}
