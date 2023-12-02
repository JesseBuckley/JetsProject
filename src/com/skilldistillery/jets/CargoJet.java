package com.skilldistillery.jets;

public class CargoJet extends PassengerJet implements CargoCarrier {

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println("loading that cargo...");
	}

}
