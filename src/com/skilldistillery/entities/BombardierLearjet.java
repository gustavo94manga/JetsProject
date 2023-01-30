package com.skilldistillery.entities;

public class BombardierLearjet extends Jet implements Bombardier{

	public BombardierLearjet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println("Bombardier revving up engines, ready for take off.");
		System.out.println("Total flight time on one tank: " + ((int)(speed/range * 100)) +  "hours\n");

	}

	@Override
	public void fight() {
		System.out.println(getModel() + " targeting surface to air missiles...Engage! Engage! \n");
	}

}
