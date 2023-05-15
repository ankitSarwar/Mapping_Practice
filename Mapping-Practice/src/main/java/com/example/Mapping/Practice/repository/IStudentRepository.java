package com.example.Mapping.Practice.repository;

import com.example.Mapping.Practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {

}
