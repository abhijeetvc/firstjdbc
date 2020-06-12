package com.jdbc.firstjdbc.repository;

import com.jdbc.firstjdbc.model.Employee;

import java.util.List;

public interface EmployeeRepository {

   // String saveEmployee(Employee e);

    List<Employee> getAllEmployees();

    Employee findById(Integer id);
}
