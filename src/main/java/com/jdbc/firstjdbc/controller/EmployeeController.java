package com.jdbc.firstjdbc.controller;

import com.jdbc.firstjdbc.dao.EmployeeDao;
import com.jdbc.firstjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

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

    @PostMapping(value="/save")
    public String saveData(@RequestBody Employee employee){
        return employeeDao.saveEmployee(employee);
    }

    @PutMapping(value = "/update/{id}/{name}")
    public String updateEmp(@PathVariable Integer id,
                            @PathVariable String name){
        return employeeDao.updateEmployee(id,name);

    }

    @GetMapping(value="/joindata")
    public List<Map<String,Object>> getData(){
        return employeeDao.getCombinedData();
    }
}
