package com.cogent.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.SpringBoot.entity.Entity;
import com.cogent.SpringBoot.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/findAll")
	List<Entity> findAll() {
		return employeeRepo.findAll();
	}

	@PostMapping("/employee")
	String addEmployee(@RequestBody Entity entity) {
		employeeRepo.save(entity);
		
		return "add Employee";
	}

	String updateEmployee() {

		return "update Employee";
	}


	@DeleteMapping("delemp/{id}")
	String delEmployee(@PathVariable("id") int empid) {
		employeeRepo.deleteById(empid);
		return "del Employee";
	}


	@GetMapping("/employee")
	String getEmployee() {
		return "get Employee";
	}
}
