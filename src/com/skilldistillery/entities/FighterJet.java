package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {

	
	
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public void fight() {
		System.out.println(getModel() + " ENGAGING TARGET! Prrrrt prrrrt prrrrrrrrrrrt! \n");
	}

	@Override
	public void fly() {
		System.out.println("FighterJet, ready for take off, 'til Valhalla");
		System.out.println("Total flight time on one tank: " + ((int)(speed/range * 100)) +  "hours\n");

	}

}
