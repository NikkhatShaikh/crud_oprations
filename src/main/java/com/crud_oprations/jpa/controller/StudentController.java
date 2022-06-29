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
   // saved in bulk quantity
    @PostMapping("/saveAll/student")
    public String createAllStudent(@RequestBody List<Student> studentList){
     this.studentService.saveAllStudent(studentList);
     return " Data is saved successfully!!!";
    }

    @GetMapping("/get/student/byName/{name}")
    public List<Student> studentList(@PathVariable String name){
        return this.studentService.findByNameContainingIgnoreCase(name);
    }

    @GetMapping("/get/student/by/nameAndCity")
    public List<Student> studentListByNameAndCity(@RequestParam String name,@RequestParam String city){
        return this.studentService.findByNameAndCityContainingIgnoreCase(name, city);
    }

    @GetMapping("/getAll/student")
    public List<Student>findAllStudent(){
        return this.studentService.findAllStudent();
    }

    @DeleteMapping("delete/StudentbyId")
    public String deleteStudent(@RequestParam Long id){
        this.studentService.deleteStudent(id);
        return "Record Deleted Successfully !!!";
    }


}
