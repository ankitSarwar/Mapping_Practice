package com.example.Mapping.Practice.repository;

import com.example.Mapping.Practice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends JpaRepository<Laptop, String> {

}
