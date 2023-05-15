package com.example.Mapping.Practice.repository;

import com.example.Mapping.Practice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICourseRepository extends JpaRepository<Course, String> {

    Optional<Course> findByTitle(String title);

    Course deleteByTitle(String title);
}
