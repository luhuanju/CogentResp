package com.cogent.SpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.SpringBoot.entity.Entity;

public interface EmployeeRepo extends JpaRepository<Entity, Integer> {
	

}
