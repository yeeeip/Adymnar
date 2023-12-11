package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher extends AppUser {

    @Enumerated(EnumType.STRING)
    private Subject subject;

    public Teacher() {
    }

    public Teacher(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

}
