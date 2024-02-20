package br.com.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.entity.User;
import br.com.apirest.service.UserService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@Operation(summary = "Save a new User", tags = "User")
	@PostMapping
	public ResponseEntity<User> save(@RequestBody User  user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
	
}
