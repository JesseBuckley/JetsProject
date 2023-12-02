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
			} else if(jet instanceof FighterJet) {
				((FighterJet) jet).fly();
			}
		}
	}
}
