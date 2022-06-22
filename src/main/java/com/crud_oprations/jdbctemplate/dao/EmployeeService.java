package com.crud_oprations.jdbctemplate.dao;

import com.crud_oprations.jdbctemplate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeService implements EmployeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate ;

    String insertData="insert into employee (name,location,department) values (?,?,?)";
    String findAll="select * from employee";
    String findById="select * from employee where id=?";
    String deleteById="delete from employee where id=?";
    String updateRecords = "update employee set name=?, location=?,department=? where id=?";



    @Override
    public String createEmployee(Employee employee) {
        jdbcTemplate.update(insertData,new Object[]{employee.getName(),employee.getLocation(),employee.getDepartment()});
        return "Data is saved Successfully!!!";
    }

    @Override
    public List<Employee> employeeList() {
        return jdbcTemplate.query(findAll,new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    @Override
    public Employee findById(Long id) {
        return jdbcTemplate.queryForObject(findById,new BeanPropertyRowMapper<>(Employee.class),id);
    }

    @Override
    public int update(Long id, Employee e) {

        return jdbcTemplate.update(updateRecords, new Object[]{e.getName(), e.getLocation(), e.getDepartment(), id});
    }

        @Override
    public void deleteEmployee(Long id) {
        jdbcTemplate.update(deleteById,id);

    }
}
