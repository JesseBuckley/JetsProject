package com.skilldistillery.jets;

public class FighterJet extends PilotOnlyJet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("This fighter jet fights!");
	}
}
