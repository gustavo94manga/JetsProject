package com.skilldistillery.entities;

public class PilatusPC extends Jet implements Pilatus{

	public PilatusPC(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Pilatus on it's way! Let's go get them boys! ");
		System.out.println("Total flight time on one tank: " + ((int)(speed/range * 100)) +  "hours\n");

	}

	@Override
	public void fight() {
		System.out.println(getModel() + " engaging target! Launching Missiles!...Flairs! Flairs! Flairs! \n");
	}

}
