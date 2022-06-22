package com.crud_oprations.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud_oprations.jpa.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
       List<Student> findByName(String name);


}
