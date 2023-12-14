package com.example.stajChallenge.repository;

import com.example.stajChallenge.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
