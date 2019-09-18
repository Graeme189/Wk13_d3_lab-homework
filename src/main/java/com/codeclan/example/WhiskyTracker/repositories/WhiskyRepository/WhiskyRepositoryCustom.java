package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    List<Whisky> findWhiskiesForYear(int year);

    List<Whisky> findWhiskiesFromDistilleryByAge(String name, int age);

}
