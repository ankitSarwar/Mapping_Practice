package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Laptop;
import com.example.Mapping.Practice.repository.ILaptopRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepository laptopRepository;


    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public ResponseEntity<Laptop> getAllLaptops() {
        return (ResponseEntity<Laptop>) laptopRepository.findAll();
    }

    public Optional<Laptop> getLaptopById(String laptopId) {
        return laptopRepository.findById(laptopId);
    }

    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public void deleteLaptop(String laptopId) {
        laptopRepository.deleteById(laptopId);
    }
}
