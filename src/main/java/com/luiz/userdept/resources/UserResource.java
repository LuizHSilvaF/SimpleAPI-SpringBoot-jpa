package com.luiz.userdept.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.userdept.entities.User;
import com.luiz.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserRepository repo;
	
	@GetMapping
	public List<User> findAll(){
		List<User> users =  repo.findAll();
		return users;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User findUser = repo.findById(id).get();
		return findUser;
	}
	
	@PostMapping
	public User insert(@RequestBody User obj) {
		User user = repo.save(obj);
		return user;
	}
}
