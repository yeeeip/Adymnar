package com.nuzhd.adymnarscheduleapp.repo;

import com.nuzhd.adymnarscheduleapp.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepo extends JpaRepository<SchoolClass, Long> {
}
