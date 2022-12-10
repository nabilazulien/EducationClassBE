package com.example.demo.repository;

import com.example.demo.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EducationRepository extends JpaRepository<Education, UUID> {
    Optional<Education> findById (UUID id);
    Optional<Education> findByName (String name);
    Optional<Education> findByDescription (String description);
}
