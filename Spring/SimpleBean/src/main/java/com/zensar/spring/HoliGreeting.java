package com.zensar.spring;

/*
 * Author: Sakshi Tiwari
 * Creation Dat: 27th July 2019 12.46PM IST
 * Modified Date: 27th July 2019 12.46PM IST
 * Version: 1.0
 * Copyright:Zensar. All rights reserved.
 * Description: Specialized Holi Greeting 
 * 
 */
public class HoliGreeting implements Greeting {

	public HoliGreeting() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Holi Greeting Created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}

}
