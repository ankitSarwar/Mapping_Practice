package com.example.Mapping.Practice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;


    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
