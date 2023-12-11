package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "school_class")
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String className;
    @OneToMany(mappedBy = "schoolClass")
    private List<Student> students;
}
