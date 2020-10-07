package com.viniciusfinger.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.stereotype.Service;

import com.viniciusfinger.course.entities.User;
import com.viniciusfinger.course.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public ResponseEntity findById(long id) {
		Optional<User> obj = repository.findById(id);
		if (obj.isEmpty()) {
			return ResponseEntity.notFound().build();	
		} else {
			User user = obj.get();
			return ResponseEntity.ok(user);
		}
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
