package com.crud_oprations.jpa.service;

import com.crud_oprations.jpa.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findByName(String name);
    void saveStudent(Student student );
}
