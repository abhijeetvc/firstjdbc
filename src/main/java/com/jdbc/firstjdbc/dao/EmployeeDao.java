package com.jdbc.firstjdbc.dao;

import com.jdbc.firstjdbc.model.Employee;
import com.jdbc.firstjdbc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveEmployee(Employee e) {
        String sql="insert into employee values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{e.getId(),e.getName(),e.getCity()},
                new int[]{Types.INTEGER,Types.VARCHAR,Types.VARCHAR});

        return "Employee saved successfully";
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql="select * from employee";
        List<Employee> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Employee.class));
        return list;
    }

    @Override
    public Employee findById(Integer id) {
        String sql="select * from employee where id=?";
        Employee e= (Employee) jdbcTemplate.queryForObject(sql,new Object[]{id},
                new BeanPropertyRowMapper(Employee.class));
        return e;
    }

    @Override
    public String updateEmployee(Integer id, String name) {
        String sql="update employee set name=? where id=?";
        jdbcTemplate.update(sql,new Object[]{name,id});
        return "Employee updated successfully";
    }

    @Override
    public List<Map<String, Object>> getCombinedData() {

        String sql="select a.id,a.name,a.city,b.name as deptName from employee a,department b where a.dept_id=b.id";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        return list;
    }
}
