package com.jdbc.firstjdbc.controller;

import com.jdbc.firstjdbc.jpamodel.Address;
import com.jdbc.firstjdbc.jparepository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping(value="/save1")
    public String saveAddress(@RequestBody Address address){
        addressRepository.save(address);
        return "Address saved";
    }
}
