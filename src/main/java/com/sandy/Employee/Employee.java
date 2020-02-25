package com.sandy.Employee;

public class Employee {
	private int id;

	
	public Employee(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void display() {
		System.out.println(id);
	}
}
