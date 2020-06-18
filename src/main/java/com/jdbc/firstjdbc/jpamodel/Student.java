package com.jdbc.firstjdbc.jpamodel;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

     @OneToMany(mappedBy = "student")
     private Set<Address> addressSet;
}

// Implement OneToOne
// Save student and address at the same time. Use single insert or save method
// Fetch the student and its addresses based on the student id
