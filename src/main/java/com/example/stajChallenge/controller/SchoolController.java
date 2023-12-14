package com.example.stajChallenge.controller;

import com.example.stajChallenge.model.School;
import com.example.stajChallenge.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Long id) {
        return schoolService.getSchoolById(id).orElse(null);
    }

    @PostMapping
    public String addSchool(@RequestBody School school) {
        schoolService.addSchool(school);
        return "Yeni okul eklendi: " + school.getName();
    }

    @PutMapping("/{id}")
    public String updateSchool(@PathVariable Long id, @RequestBody School newSchool) {
        schoolService.updateSchool(id, newSchool);
        return "Okul ID " + id + " güncellendi.";
    }

    @DeleteMapping("/{id}")
    public String deleteSchool(@PathVariable Long id) {
        schoolService.deleteSchool(id);
        return "Okul ID " + id + " silindi.";
    }
}