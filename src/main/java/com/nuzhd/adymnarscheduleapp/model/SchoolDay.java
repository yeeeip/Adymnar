package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.*;

@Entity
public class SchoolDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
    @ManyToOne
    private SchoolWeek schoolWeek;
    private boolean isDayOff;
}
