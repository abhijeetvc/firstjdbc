package com.jdbc.firstjdbc.jparepository;

import com.jdbc.firstjdbc.jpamodel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);
}
