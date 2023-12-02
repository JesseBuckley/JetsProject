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
	public ArrayList<Jet> getJets() {
		return jets;
	}
	public void setJets(ArrayList<Jet> jets) {
		this.jets = jets;
	}
}
