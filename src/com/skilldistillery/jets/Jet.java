package com.skilldistillery.jets;

public abstract class Jet {
	String model;
	double speed;
	int range;
	long price;

	public void fly() {
		double flightTime = this.range / this.speed;
		System.out.println("model " + this.model);
		System.out.println("speed " + this.speed + "Mph");
		System.out.println("range " + this.range);
		System.out.println("price " + this.price);
		System.out.println(flightTime);
	}

}
