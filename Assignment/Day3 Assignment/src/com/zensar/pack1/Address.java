package com.zensar.pack1;

public class Address {
	private String street;
	private String area;
	private String city;
	private String state;
	public Address(String street, String area, String city, String state) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}
  public Address(){
	  
  }
  public void display(){
	  System.out.println("Address " + street+" " + area +" "+ city +" " +state);
  }

}
