package com.devs4j.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devs4j.entities.User;
import com.devs4j.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<>(service.getUsers(),HttpStatus.OK);
	}
	
}
