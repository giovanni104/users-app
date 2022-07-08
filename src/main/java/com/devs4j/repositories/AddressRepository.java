package com.devs4j.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devs4j.entities.Address;

@Repository
public interface AddressRepository  extends CrudRepository<Address, Integer>{

}
