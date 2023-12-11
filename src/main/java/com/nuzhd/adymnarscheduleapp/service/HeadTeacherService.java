package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.HeadTeacher;
import com.nuzhd.adymnarscheduleapp.model.Role;
import com.nuzhd.adymnarscheduleapp.repo.HeadTeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadTeacherService {

    private final HeadTeacherRepository headTeacherRepository;

    public HeadTeacherService(HeadTeacherRepository headTeacherRepository) {
        this.headTeacherRepository = headTeacherRepository;
    }

    public List<HeadTeacher> findAll() {
        List<HeadTeacher> headTeachers = headTeacherRepository.findAll();
        headTeachers.forEach(ht -> ht.setUserRole(Role.HEAD_TEACHER));
        return headTeachers;
    }

}
