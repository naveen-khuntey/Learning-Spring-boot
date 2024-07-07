package com.naveen.SpringBootJDBC.service;

import com.naveen.SpringBootJDBC.model.Student;
import com.naveen.SpringBootJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
