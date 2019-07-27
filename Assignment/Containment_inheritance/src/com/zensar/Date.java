package com.zensar;

public class Date {

	private int dd, mm, yy;
	Date(){
		dd=1;
		mm=1;
		yy=2000;
		
	}
	public Date(int d ,int m ,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display(){
		System.out.println(dd+  "/" + mm +"/"+ yy);
	}
}
