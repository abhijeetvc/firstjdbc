package com.jdbc.firstjdbc.jpamodel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String area;
    private String pincode;

    @ManyToOne
    @JoinColumn(name="stud_id")
    private Student student;
}
