package com.zensar;


public class Employee {
	private int empid;
    private String name;
    private Date dob;
    
   public Employee(){
    empid=1;
    name="ABC";
    dob =new Date();
    }
 public Employee(int i, String n ,int  m, int d, int y ){
	 empid=i;
	 name=n;
	 dob=new Date(d,m,y);
 }
 public void display(){
	 System.out.println(empid);
	 System.out.println(name);
	 dob.display();
 }
}
