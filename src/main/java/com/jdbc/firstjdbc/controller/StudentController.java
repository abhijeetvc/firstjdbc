package com.jdbc.firstjdbc.controller;

import com.jdbc.firstjdbc.jpamodel.Student;
import com.jdbc.firstjdbc.jparepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value="/savestudent")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Student saved";
    }
}
