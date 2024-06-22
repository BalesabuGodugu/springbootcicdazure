package com.example.cicdspringbootdemo.controller;

import com.example.cicdspringbootdemo.model.Employee;
import com.example.cicdspringbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/all")
    public List<Employee> getAllemps(){
        return  this.employeeService.getAllEmps();
    }


    @PostMapping("/add")
    public String addNewEmployee(@RequestBody Employee employee){
        return  this.employeeService.addEmp(employee);
    }


}
