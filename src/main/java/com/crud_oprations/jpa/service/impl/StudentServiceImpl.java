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
    public List<Student> findByNameAndCityContainingIgnoreCase(String name, String city) {
        return studentRepository.findByNameAndCityContainingIgnoreCase(name, city);
    }

    @Override
    public List<Student> findAllStudent() {
        return this.studentRepository.findAll();
    }

    @Override
    public List<Student> saveAllStudent(List<Student> studentList) {
        this.studentRepository.saveAll(studentList);

        return studentList;
    }

    @Override
    public void deleteStudent(Long id) {
        this.studentRepository.deleteById(id);

    }

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);

    }

    @Override
    public List<Student> findByNameContainingIgnoreCase(String name) {
        return this.studentRepository.findByNameContainingIgnoreCase(name);
    }

}
