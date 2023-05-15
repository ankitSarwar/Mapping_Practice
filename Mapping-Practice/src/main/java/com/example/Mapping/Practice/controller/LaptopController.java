package com.example.Mapping.Practice.controller;

import com.example.Mapping.Practice.model.Laptop;
import com.example.Mapping.Practice.service.LaptopService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    @Autowired
    LaptopService laptopService;


    @PostMapping("/add")
    public ResponseEntity<Laptop> createLaptop(@RequestBody Laptop laptop) {
        Laptop createdLaptop = laptopService.createLaptop(laptop);
        return ResponseEntity.ok(createdLaptop);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Laptop> getAllLaptops() {

        return ResponseEntity.ok(laptopService.getAllLaptops().getBody());
    }

    @GetMapping("/{laptopId}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable String laptopId) {
        Optional<Laptop> laptop = laptopService.getLaptopById(laptopId);
        return laptop.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update")
    public ResponseEntity<Laptop> updateLaptop(@RequestBody Laptop laptop) {
        Laptop updatedLaptop = laptopService.updateLaptop(laptop);
        return ResponseEntity.ok(updatedLaptop);
    }

    @DeleteMapping("/{laptopId}")
    public ResponseEntity<Void> deleteLaptop(@PathVariable String laptopId) {
        laptopService.deleteLaptop(laptopId);
        return ResponseEntity.noContent().build();
    }
}
