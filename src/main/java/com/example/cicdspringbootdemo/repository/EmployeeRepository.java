package com.example.cicdspringbootdemo.repository;

import com.example.cicdspringbootdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
