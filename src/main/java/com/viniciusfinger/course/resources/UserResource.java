package com.viniciusfinger.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusfinger.course.entities.User;
import com.viniciusfinger.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok(list); 
	}

	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return obj;
	}
	
	@PostMapping
	public ResponseEntity insert(@RequestBody User obj){
		ResponseEntity response = service.insert(obj);
		return response;
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity update(@PathVariable Long id, @RequestBody User obj) {
		User response = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}

