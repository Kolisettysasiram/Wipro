package com.automobile.twowheeler;

import com.automobile.*;

public class Hero extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Hero(String m, String r, String o, int s) {
		super();
		modelName = m;
		registrationNumber = r;
		ownerName = o;
		speed = s;
	}
	
	public String getModelName() {
		return modelName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("radio");
	}
}
