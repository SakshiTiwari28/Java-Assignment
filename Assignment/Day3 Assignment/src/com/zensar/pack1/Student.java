package com.zensar.pack1;

public class Student {
	private int rollno;
	private String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student(){
		rollno=0;
		name=null;
	}
	public void display(){
		System.out.println("Student details " +rollno + name);
	}

}
