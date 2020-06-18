package com.jdbc.firstjdbc.controller;

import com.jdbc.firstjdbc.jpamodel.Student;
import com.jdbc.firstjdbc.jparepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// JPA Relations : a) OneToOne , b) OneToMany, c) ManyToOne, d)ManytoMany


@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value="/savestudent")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Student saved";
    }

    @GetMapping(value="/getstudents")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @GetMapping(value="/getstudent/{id}")
    public Optional<Student> getStudent1(@PathVariable Integer id){
        return studentRepository.findById(id);
    }

    @GetMapping(value="/getstudent/{firstName}/{lastName}")
    public List<Student> getStuByFirstNameAndLastName(@PathVariable String firstName,
                                                      @PathVariable String lastName){
        return studentRepository.findByFirstNameAndLastName(firstName,lastName);
    }
}
