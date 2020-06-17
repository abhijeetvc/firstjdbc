package com.jdbc.firstjdbc.jpamodel;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Student {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String firstName;
     private String lastName;
     private String city;
     private String emailId;
}