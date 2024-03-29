package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
    List<Whisky> findWhiskiesForYear(int year);

    List<Whisky> findWhiskiesFromDistilleryByAge(String name, int age);

    List<Whisky> findWhiskiesByRegion(String region);
}
