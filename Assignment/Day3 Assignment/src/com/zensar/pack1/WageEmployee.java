package com.zensar.pack1;

public class WageEmployee extends Employee {
	private int hours;
	private int rate;
	private float salary;
	public WageEmployee(int hours, int rate, int id, String n, String dob) {
		super(id, n , dob);
		this.hours = hours;
		this.rate = rate;
	}
	public WageEmployee(){
		hours=1;
		rate=1;
	}
	public void display(){
		super.display();
		System.out.println(hours);
		System.out.println(rate);
	}
	public float Salary(){
		salary = hours*rate;
//		System.out.println("Salary is "+salary);
		return salary;
	}

	
	
	

}
