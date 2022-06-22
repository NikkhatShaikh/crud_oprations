package com.crud_oprations.jdbctemplate.dao;

import com.crud_oprations.jdbctemplate.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    String createEmployee(Employee employee);
    List<Employee> employeeList();
    Employee findById(Long id);
    int update(Long id,Employee e);
    void deleteEmployee(Long id);


}
