package com.luiz.userdept.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.userdept.entities.Department;
import com.luiz.userdept.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentResource {

	@Autowired
	private DepartmentRepository repo;
	
	@GetMapping
	public List<Department> findAll(){
		List<Department> users =  repo.findAll();
		return users;
	}
	
	@GetMapping(value = "/{id}")
	public Department findById(@PathVariable Long id) {
		Department depart = repo.findById(id).get();
		return depart;
	}
	
	@PostMapping
	public Department insert(@RequestBody Department obj) {
		Department newDepart = repo.save(obj);
		return newDepart;
	}
}
