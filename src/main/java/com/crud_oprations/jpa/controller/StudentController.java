package com.crud_oprations.jpa.controller;

import com.crud_oprations.jpa.model.Student;
import com.crud_oprations.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/api/create/student")
    public String createStudent(@RequestBody Student student){
        this.studentService.saveStudent(student);
        return "student Created Successfully";
    }

    @GetMapping("/get/student/byName/{name}")
    public List<Student> studentList(@PathVariable String name){
        return this.studentService.findByName(name);

    }


}
