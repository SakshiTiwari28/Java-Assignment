package com.zensar.emp;


public class employee {
		private int empid;
		private String name;
		private static int count;
		//instance block;
		
	static{
		//static block;
		System.out.println("First Static Block");
		count=0;
	}
	public static void showemp(){
		System.out.println(" Number of objects "+count);
	}
	public employee(){
		count++;
	}
	public employee(int empid ,String name){
	 this.empid=empid;
	 this.name=name;
	 count++;
	}
	public  void display(){
		System.out.println(+empid+ " " + name);
	}
}
