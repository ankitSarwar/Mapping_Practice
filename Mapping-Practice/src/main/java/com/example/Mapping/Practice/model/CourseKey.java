package com.example.Mapping.Practice.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;

@Embeddable
public class CourseKey implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long appId;
    public Long courseFees ;
}
