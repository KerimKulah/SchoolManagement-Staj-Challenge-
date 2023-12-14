package com.example.stajChallenge.service;

import com.example.stajChallenge.model.School;

import java.util.List;
import java.util.Optional;

public interface SchoolService {

    List<School> getAllSchools();

    Optional<School> getSchoolById(Long id);

    School addSchool(School school);

    School updateSchool(Long id, School newSchool);

    void deleteSchool(Long id);
}
