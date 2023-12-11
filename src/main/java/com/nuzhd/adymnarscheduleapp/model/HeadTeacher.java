package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "head_teacher")
public class HeadTeacher extends AppUser {

    public HeadTeacher() {
    }

    public HeadTeacher(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }
}
