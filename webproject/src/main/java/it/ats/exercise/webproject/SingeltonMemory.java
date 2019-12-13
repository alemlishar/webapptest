package it.ats.exercise.webproject;

import java.util.ArrayList;



public class SingeltonMemory {
	
	private static SingeltonMemory singletonInstance;
	private  String atmCollections;

	public static SingeltonMemory getInstance(){
		if (singletonInstance == null) {
			singletonInstance = new SingeltonMemory();
		}
		
		return singletonInstance;
	}
	
	private SingeltonMemory() {

		atmCollections = null;
	}

	public String getAtmCollections() {

		return this.atmCollections;
	}

	public void setAtmCollection(String atms) {

		atmCollections = atms;
	}
	
}
