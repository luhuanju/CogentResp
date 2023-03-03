package com.cogent.SpringBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "employee")
public class Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(nullable = false)
	String nameString;
	@Column(nullable = false)
	String depString;
	@Column(nullable = false)
	double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getDepString() {
		return depString;
	}

	public void setDepString(String depString) {
		this.depString = depString;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", nameString=" + nameString + ", depString=" + depString + ", salary=" + salary
				+ "]";
	}

	public Entity() {
		super();

	}
	public Entity(int id, String nameString, String depString, double salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.depString = depString;
		this.salary = salary;
	}

}
