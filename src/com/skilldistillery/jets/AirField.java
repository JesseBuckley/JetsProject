package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Scanner;

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
			} else {
				jet.fly();
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
	//I made a second scanner because nextLine was starting to be a massive problem. This seemed to fix it. I wanted to be able to use spaces in model. 
	public void addUserJet(Scanner sc, Scanner forNextLines) {
			System.out.println("Enter model name for the new Jet");
			String model = forNextLines.nextLine();
			System.out.println("Enter a speed in MPH, can be a decimal if you like.");
			double speed = sc.nextDouble();
			System.out.println("Enter a range this jet can travel before running out of fuel.");
			int range = sc.nextInt();
			System.out.println("Enter a price for the jet.");
			long price = sc.nextLong();
			Jet userJet = new PassengerJet(model, speed, range, price);
			jets.add(userJet);
		
			System.out.println("Jet added successfully.");
		}		
		public void removeUserJet(Scanner sc) {
			System.out.println("-----------------Enter the number of the jet you would like to remove-----------------\n");
		for (int i = 0; i < jets.size(); i++) {
			System.out.println("(" + i + ") " + jets.get(i) + "\n");
		}
		if (jets.size() >= 1) {
			int userChoice = sc.nextInt();
			jets.remove(userChoice);
		} else if (jets.size() == 0) {
			System.out.println("THERE ARE NO MORE JETS YOU DELETED THEM.");
			return;
		}
		System.out.println("Jet removed successfully.");
	}
}
