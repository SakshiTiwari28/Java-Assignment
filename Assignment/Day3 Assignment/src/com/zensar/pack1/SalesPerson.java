package com.zensar.pack1;

public class SalesPerson extends WageEmployee{
	private int itemsold;
	private int commision;
	private float salary; 
	
	public SalesPerson(int itemsold, int commision, int hours, int rate, int id, String n, String dob) {
		super(hours , rate, id, n,dob);
		this.itemsold = itemsold;
		this.commision = commision;
	}
	public SalesPerson(){
		super();
		itemsold=0;
		commision=0;
		
	}
	public void display(){
		super.display();
		System.out.println("Item Sold " +itemsold);
		System.out.println("Commission Earned "+commision);
	
	}
	public void salary(){
		salary= super.Salary()+(itemsold*commision);
		System.out.println("Salary is " +salary);
		
	}
	

}
