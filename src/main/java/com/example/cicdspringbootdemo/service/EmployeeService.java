package com.example.cicdspringbootdemo.service;

import com.example.cicdspringbootdemo.model.Employee;
import com.example.cicdspringbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmps(){
        return  this.employeeRepository.findAll();
    }


    public String addEmp(Employee employee){
        this.employeeRepository.save(employee);
        return  "added employee successfully";
    }
}
