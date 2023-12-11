package com.nuzhd.adymnarscheduleapp.repo;

import com.nuzhd.adymnarscheduleapp.model.Student;
import com.nuzhd.adymnarscheduleapp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Teacher> findByLogin(String login);
}
