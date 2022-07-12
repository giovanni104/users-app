package com.devs4j.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devs4j.entities.User;
 

@Repository
public interface UserRepository   extends JpaRepository<User, Integer> {

}
