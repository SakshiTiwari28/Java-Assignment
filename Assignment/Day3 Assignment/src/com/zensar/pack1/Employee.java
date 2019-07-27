package com.zensar.pack1;

public class Employee {
	private int employeeId;
	private String name;
	private String dob;
	public Employee(int employeeId, String name, String dob) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.dob = dob;
	}
	public Employee(){
		
	}
 public void display(){
	 System.out.println("Details of employee " +employeeId+ " " + name+ " "+ dob);
 }
}
