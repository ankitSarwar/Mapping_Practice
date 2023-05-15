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

    public void deleteCourse(String title) {

        Optional<Course> courseTitle =courseRepository.findByTitle(title);
////        studentRepository.
//                Student studentList= (Student) courseTitle.get().getStudentList();
//        studentRepository.deleteByStudent(studentList);

    }


}

