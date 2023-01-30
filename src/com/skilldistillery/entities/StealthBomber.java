package com.skilldistillery.entities;

public class StealthBomber extends Jet implements Bomber{

	public StealthBomber(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void bombsAway() {
		System.out.println("Bombs away!! Boom! Boom! Boom!");
	}

	@Override
	public void fly() {
		System.out.println("Stealth Bomber en route ");
		System.out.println("Total flight time on one tank: " + ((int)(speed/range * 100)) +  "hours\n");

	}
	
	
	
}
