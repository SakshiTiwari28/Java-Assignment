package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

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

public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;
	
	
	//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}


   //for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is get");
	}


   //business logic of Instrumentalist
	public void perform(){
		System.out.println("Instrumentalist is playing " + song);
		instrument.play();
	}

}
