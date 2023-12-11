package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends AppUser {

    @ManyToOne(fetch = FetchType.LAZY)
    private SchoolClass schoolClass;

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, SchoolClass schoolClass) {
        super(firstName, middleName, lastName);
        this.schoolClass = schoolClass;
    }

}
