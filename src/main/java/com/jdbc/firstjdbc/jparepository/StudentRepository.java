package com.jdbc.firstjdbc.jparepository;

import com.jdbc.firstjdbc.jpamodel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
