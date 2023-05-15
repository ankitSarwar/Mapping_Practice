package com.example.Mapping.Practice.repository;

import com.example.Mapping.Practice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, String> {
}
