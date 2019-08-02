package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("rakhi")
public class FestivalGreeting implements Greeting {

	
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Happy Rakhi";
	}
    public FestivalGreeting() {
    	// TODO Auto-generated constructor stub
       System.out.println("Greeting Created");
	
}
}
