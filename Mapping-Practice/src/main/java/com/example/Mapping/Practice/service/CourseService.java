package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Course;
import com.example.Mapping.Practice.model.CourseKey;
import com.example.Mapping.Practice.model.Student;
import com.example.Mapping.Practice.repository.ICourseRepository;
import com.example.Mapping.Practice.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    ICourseRepository courseRepository;

    @Autowired
    IStudentRepository studentRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseByTitle(String title) {
       return courseRepository.findByTitle(title);
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }



    public void deleteCourseByTitle(String title) {
        Optional<Course> course = courseRepository.findByTitle(title);
        if (course.isPresent()) {
            courseRepository.delete(course.get());
        } else {
            // Handle the case where the course with the specified title doesn't exist
            throw new IllegalStateException("Course not found");
        }
    }


}

