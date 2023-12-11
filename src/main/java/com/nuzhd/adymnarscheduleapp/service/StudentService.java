package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.Role;
import com.nuzhd.adymnarscheduleapp.model.Student;
import com.nuzhd.adymnarscheduleapp.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        List<Student> students = studentRepository.findAll();
        students.forEach(ht -> ht.setUserRole(Role.STUDENT));
        return students;
    }
}
