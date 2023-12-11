package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class AppUserService {

    private final StudentService studentService;
    private final TeacherService teacherService;
    private final HeadTeacherService headTeacherService;

    public AppUserService(StudentService studentService, TeacherService teacherService, HeadTeacherService headTeacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.headTeacherService = headTeacherService;
    }

    public AppUser findByLogin(String login) {
        return Stream.concat(Stream.concat(studentService.findAll().stream(),
                                teacherService.findAll().stream()),
                        headTeacherService.findAll().stream()
                ).filter(u -> u.getLogin().equals(login))
                .findFirst().orElse(null);
    }
}
