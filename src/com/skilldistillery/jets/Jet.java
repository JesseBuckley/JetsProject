package com.skilldistillery.jets;

public abstract class Jet {
	String model;
	double speed;
	int range;
	long price;

	public void fly() {
		double flightTime = this.range / this.speed;
		System.out.print("Model: " + this.model + "\n");
		System.out.print("Speed: " + this.speed + "MPH, ");
		System.out.print("Range: " + this.range + ", ");
		System.out.print("Price: " + this.price + "USD, ");
		System.out.printf("Your flight time is before running out of fuel is: " + "%.2f", flightTime); System.out.print("hrs.\n");
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet Model: " + model + ", Top speed: " + speed + "MPH, Max range: " + range + ", Price: " + price +"USD";
	}
}
