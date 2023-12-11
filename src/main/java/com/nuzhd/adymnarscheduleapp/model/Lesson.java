package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.*;

@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ClassRoom classRoom;
    private int lessonOrder;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private SchoolDay schoolDay;
    @ManyToOne
    private SchoolClass schoolClass;

}
