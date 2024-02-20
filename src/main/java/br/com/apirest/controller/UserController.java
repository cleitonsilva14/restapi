package br.com.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.entity.User;
import br.com.apirest.service.UserService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Operation(summary = "Find all Users", tags = "User")
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}

	@Operation(summary = "Find user by ID", tags = "User")
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = userService.findById(id);
		return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
	}

	@Operation(summary = "Save a new User", tags = "User")
	@PostMapping
	public ResponseEntity<User> save(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}

	@Operation(summary = "Update a user", tags = "User")
	@PutMapping("/{id}")
	public ResponseEntity<User> update(@RequestBody User user, @PathVariable Long id) {
		return ResponseEntity.ok(userService.update(id, user));
	}

	@Operation(summary = "Delete a user", tags = "User")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}

}
