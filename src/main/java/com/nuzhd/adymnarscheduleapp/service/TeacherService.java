package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.Role;
import com.nuzhd.adymnarscheduleapp.model.Teacher;
import com.nuzhd.adymnarscheduleapp.repo.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> findAll() {
        List<Teacher> teachers = teacherRepository.findAll();
        teachers.forEach(ht -> ht.setUserRole(Role.TEACHER));
        return teachers;
    }

}
