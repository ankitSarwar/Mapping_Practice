package com.example.Mapping.Practice.controller;

import com.example.Mapping.Practice.model.Course;
import com.example.Mapping.Practice.model.CourseKey;
import com.example.Mapping.Practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;


    @PostMapping("/add")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return ResponseEntity.ok(createdCourse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Course> getCourseById(@PathVariable String title) {
        Optional<Course> course = courseService.getCourseByTitle(title);
        return course.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        Course updatedCourse = courseService.updateCourse(course);
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String title) {
        courseService.deleteCourse(title);
        return ResponseEntity.noContent().build();
    }
}
