package com.example.stajChallenge.service;

import com.example.stajChallenge.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student addStudent(Student student);

    Student updateStudent(Long id, Student newStudent);

    void deleteStudent(Long id);

}
