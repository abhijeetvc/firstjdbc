package com.jdbc.firstjdbc.controller;

import com.jdbc.firstjdbc.dao.EmployeeDao;
import com.jdbc.firstjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(value="/getallemp")
    public List<Employee> getAllEmp(){
        return employeeDao.getAllEmployees();
    }

    @GetMapping(value="/getemp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeDao.findById(id);
    }
}
