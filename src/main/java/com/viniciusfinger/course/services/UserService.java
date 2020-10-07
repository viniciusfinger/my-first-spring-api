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
	
	public HeadersBuilder<?> findById(long id) {
		Optional<User> obj = repository.findById(id);
		if (obj.isEmpty()) {
			@SuppressWarnings("unchecked")
			HeadersBuilder<?> notFound = ResponseEntity.notFound();
			return notFound;		
		} else {
			User user = obj.get();
			return (HeadersBuilder<?>) ResponseEntity.ok(user);
		}
	}
}
