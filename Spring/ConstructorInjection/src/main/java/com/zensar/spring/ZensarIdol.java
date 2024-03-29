package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/*
 * Author: Sakshi Tiwari
 * Creation Dat: 27th July 2019 12.46PM IST
 * Modified Date: 27th July 2019 12.46PM IST
 * Version: 1.0
 * Copyright:Zensar. All rights reserved.
 * Description: It represents a Juggling performer for Zensar Idol
 * Juggler gets bean bags using constructor injection
 * 
 */

public class ZensarIdol {
	public static void main(String args[]){
		
	
	ApplicationContext ctx =new ClassPathXmlApplicationContext("Performers.xml");
	Performer  p= ctx.getBean("Himanshi", Performer.class);
	p.perform();
	
	System.out.println();
	
	Performer p1=ctx.getBean("Shaily Agrawal",Performer.class);
	p1.perform();
	}
}