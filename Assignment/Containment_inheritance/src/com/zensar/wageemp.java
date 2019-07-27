package com.zensar;

public class wageemp extends Employee{
         private int rate;
         private int hour;
         public wageemp(){
        	 super();
        	rate=100;
        	hour=1;
         }
         public wageemp(int r, int h, int i , int d, int m ,int y, String n){
        	 super(i,n,d,m,y);
        	 rate=r;
        	 hour=h;
         }
         public void display(){
        	 super.display();
        	 
        	 System.out.println(hour);
        	 System.out.println(rate);
         }
	
}
