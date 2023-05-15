package com.example.Mapping.Practice.controller;

import com.example.Mapping.Practice.model.Laptop;
import com.example.Mapping.Practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/{laptopId}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable Long laptopId) {
        Optional<Laptop> laptop = laptopService.getLaptopById(laptopId);
        return laptop.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update")
    public ResponseEntity<Laptop> updateLaptop(@RequestBody Laptop laptop) {
        Laptop updatedLaptop = laptopService.updateLaptop(laptop);
        return ResponseEntity.ok(updatedLaptop);
    }

    @DeleteMapping("/{laptopId}")
    public ResponseEntity<Void> deleteLaptop(@PathVariable Long laptopId) {
        laptopService.deleteLaptop(laptopId);
        return ResponseEntity.noContent().build();
    }
}
