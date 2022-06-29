package com.crud_oprations.jpa.service;

import com.crud_oprations.jpa.model.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student );

    List<Student> findByNameContainingIgnoreCase(String name);

    List<Student> findByNameAndCityContainingIgnoreCase(String name,String city);

    List<Student>findAllStudent();
    List<Student> saveAllStudent(List<Student> studentList);

    void deleteStudent(Long id);


}
