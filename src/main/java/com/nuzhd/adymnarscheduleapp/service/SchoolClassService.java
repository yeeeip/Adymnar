package com.nuzhd.adymnarscheduleapp.service;

import com.nuzhd.adymnarscheduleapp.model.SchoolClass;
import com.nuzhd.adymnarscheduleapp.repo.SchoolClassRepo;
import org.springframework.stereotype.Service;

@Service
public class SchoolClassService {

    private final SchoolClassRepo schoolClassRepo;

    public SchoolClassService(SchoolClassRepo schoolClassRepo) {
        this.schoolClassRepo = schoolClassRepo;
    }

    public SchoolClass findById(Long id) {
        return schoolClassRepo.findById(id).orElse(null);
    }

}
