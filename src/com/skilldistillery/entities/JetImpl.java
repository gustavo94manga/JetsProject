package com.skilldistillery.entities;

public class JetImpl extends Jet{




	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

@Override
	public void fly() {
		System.out.println(toString());
		System.out.println("Based on its top speed, this aircraft can fly for: " + (speed/range));
	}


}
