package com.nuzhd.adymnarscheduleapp.repo;

import com.nuzhd.adymnarscheduleapp.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    List<Lesson> getAllBySchoolClassId(Long id);
    List<Lesson> getAllBySchoolDayId(Integer id);
}