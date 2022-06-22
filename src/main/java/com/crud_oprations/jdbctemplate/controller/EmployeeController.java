package com.crud_oprations.jdbctemplate.controller;

import com.crud_oprations.jdbctemplate.dao.EmployeeDao;
import com.crud_oprations.jdbctemplate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @PostMapping("/createEmployee")
    public String createEmployee(@RequestBody Employee e){
        employeeDao.createEmployee(e);
        return "Data Saved Successfully !!!";
    }

    @GetMapping("/employeeList")
    public List<Employee> employeeList(){
        return employeeDao.employeeList();
    }

    @GetMapping("/employee/{id}")
    public Employee getSingleEmployee(@PathVariable Long id){
        return employeeDao.findById(id);
    }

//    @PutMapping("/updateEmployeeList/{id}")
//    public String updateRecord(@RequestBody Employee employee,@PathVariable  Long id){
//        employeeDao.updateEmployee(id,employee);
//        return "Data updated successfully !!!";
//    }

    @PutMapping("/updateEmployee/{usedId}")
    public String update(@RequestBody Employee employee,@PathVariable Long usedId) {
        employeeDao.update(usedId, employee);
        return "Record updated successfully";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeDao.deleteEmployee(id);
        return "Employee deleted Successfully !!!";

    }
}
