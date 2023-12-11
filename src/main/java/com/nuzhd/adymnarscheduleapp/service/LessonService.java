package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.Lesson;
import com.nuzhd.adymnarscheduleapp.repo.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<Lesson> getBySchoolClassId(Long id) {
        return lessonRepository.getAllBySchoolClassId(id);
    }

    public List<Lesson> getAllBySchoolDayId(Integer id) {
        return lessonRepository.getAllBySchoolDayId(id);
    }
}
