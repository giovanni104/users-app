package com.devs4j.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.devs4j.entities.Role;

@Repository
public interface RoleRepository  extends CrudRepository<Role, Integer> {

}
