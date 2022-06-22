package com.crud_oprations.jpa.service.impl;

import com.crud_oprations.jpa.model.Student;
import com.crud_oprations.jpa.repository.StudentRepository;
import com.crud_oprations.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);

    }
}
