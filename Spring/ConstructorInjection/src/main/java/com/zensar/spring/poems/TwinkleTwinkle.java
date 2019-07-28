package com.zensar.spring.poems;

/*
 * Author: Sakshi Tiwari
 * Creation Dat: 27th July 2019 12.46PM IST
 * Modified Date: 27th July 2019 12.46PM IST
 * Version: 1.0
 * Copyright:Zensar. All rights reserved.
 * Description: More skilled juggler who juggles while reciting a poem
 * Poem is injected into Poetic Juggler using Constructor Injection
 * 
 */

public class TwinkleTwinkle implements Poem {

	private final  static String LINES[] ={
			"Twinkle Twinkle litle Star",
			"How I wonder What you are",
			"Up above the world so high",
			"Like a diamond in the Sky"
	};
	
	public void recite() {
		// TODO Auto-generated method stub
 
		for(String line: LINES)
			System.out.println(line);
	}

}
