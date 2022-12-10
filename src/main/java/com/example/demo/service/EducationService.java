package com.example.demo.service;

import com.example.demo.models.Education;
import com.example.demo.models.Result;

import java.util.Optional;
import java.util.UUID;

public interface EducationService {
    Optional<Result> findById (UUID id);
    Optional<Result> findByName (String name);

}
