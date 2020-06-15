package com.jdbc.firstjdbc.repository;

import com.jdbc.firstjdbc.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {

    String saveEmployee(Employee e);

    List<Employee> getAllEmployees();

    Employee findById(Integer id);

    String updateEmployee(Integer id,String name);

    List<Map<String,Object>> getCombinedData();
}
