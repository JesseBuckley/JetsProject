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
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
}
