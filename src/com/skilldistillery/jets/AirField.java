package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> jets;

	public AirField() {
		this.jets = new ArrayList<>();
	}

	public void addJet(Jet jet) {
		jets.add(jet);
	}

	public Jet fastestJet() {
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		return fastestJet;
	}

	public void printFastestJet() {
		Jet fastestJet = fastestJet();
		System.out.println(fastestJet.toString());
	}

	public Jet longestRangeJet() {
		Jet longestRangeJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getRange() > longestRangeJet.getRange()) {
				longestRangeJet = jet;
			}
		}
		return longestRangeJet;
	}

	public void printLongestRangeJet() {
		Jet longestRangeJet = longestRangeJet();
		System.out.println(longestRangeJet.toString());
	}

	public void listJets() {
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).fly();
			} else if (jet instanceof AirbusA380) {
				((AirbusA380) jet).fly();
			} else if (jet instanceof FighterJet) {
				((FighterJet) jet).fly();
			}
		}
	}

	public void loadCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoJet) {
				System.out.println(jet);
				((CargoJet) jet).loadCargo();
			}
		}
	}

	public void fightFighter() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				System.out.println(jet);
				((FighterJet) jet).fight();
			}
		}
	}
}
