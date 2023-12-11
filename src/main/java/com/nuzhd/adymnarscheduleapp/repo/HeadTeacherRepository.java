package com.nuzhd.adymnarscheduleapp.repo;

import com.nuzhd.adymnarscheduleapp.model.HeadTeacher;
import com.nuzhd.adymnarscheduleapp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HeadTeacherRepository extends JpaRepository<HeadTeacher,Long> {
    Optional<Teacher> findByLogin(String login);
}
