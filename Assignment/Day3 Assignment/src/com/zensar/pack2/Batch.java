package com.zensar.pack2;

public class Batch {
	private String courseName;
	private int batchStrength;
	private static int count;
	public Batch(String courseName, int batchStrength) {
		super();
		this.courseName = courseName;
		this.batchStrength = batchStrength;
		count++;
	}
     public Batch(){
	courseName=null;
	batchStrength=0;
	count++;
	}
     static{
    	 count=0;
     }
public void display(){
	System.out.println("Batch Details " +courseName +batchStrength);
}
public static void fun(){
	System.out.println("Object created " +count);
}
}
