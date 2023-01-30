package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	
	
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}
	@Override
	public void loadCargo() {
		System.out.println(getModel() + " Loading Cargo...Ready to go to our destination. \n");
	}

	@Override
	public void fly() {
		System.out.println("C-130 Rolling down the strip, C-130 gonna take a little trip");
		System.out.println("Total flight time on one tank: " + ((int)(speed/range * 100)) +  "hours\n");
	}
	

}
