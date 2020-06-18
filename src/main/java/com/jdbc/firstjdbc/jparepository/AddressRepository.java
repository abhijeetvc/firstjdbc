package com.jdbc.firstjdbc.jparepository;

import com.jdbc.firstjdbc.jpamodel.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
