package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Honda(String m, String r, String o, int s) {
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
	public void cdplayer() {
		System.out.println("cdplayer");
	}
}
