package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField = new AirField();

	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();

	}

	public void launch() {
		Jet cargoJet1 = new CargoJet("Cargo Spanks 9000", 250, 2000, 2_000_000);
		Jet cargoJet2 = new CargoJet("Cargo Haul Master General", 300, 2250, 2_500_000);
		Jet airbusA380 = new AirbusA380("Prince Habood's AirbusA380", 500, 8000, 18_500_000);
		Jet fighterJet1 = new FighterJet("F22 Fighter", 850, 1250, 12_000_000);
		Jet fighterJet2 = new FighterJet("F14 Fighter", 600, 1000, 4_000_000);
		airField.addJet(cargoJet1);
		airField.addJet(cargoJet2);
		airField.addJet(airbusA380);
		airField.addJet(fighterJet1);
		airField.addJet(fighterJet2);

		displayMenu_AndChooseOption();
	}

	public void displayMenu_AndChooseOption() {
		int option;
		boolean stillDisplaying = true;
		System.out.println("Welcome to the Airfield. Please decide between one of the options below:\n");
		do {

			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Quit");
			option = sc.nextInt();
			if (option == 1) {
				listJets();
			} else if (option == 2) {
				flyJets();
			} else if (option == 3) {
				viewFastestJet();
			} else if (option == 4) {
				viewLongestRange();
			} else if (option == 5) {
				loadAllCargo();
			} else if (option == 6) {
				dogFight();
			} else if (option == 8) {
				removeJet();
			} else if (option == 9) {
				System.out.println("(9)You have decided to exit the program. See ya!");
				stillDisplaying = false;
			}

		} while (stillDisplaying == true);
	}

	private void removeJet() {

	}

	private void dogFight() {

	}

	private void loadAllCargo() {

	}

	private void viewLongestRange() {

	}

	private void viewFastestJet() {

	}

	private void flyJets() {

	}

	public void listJets() {
		airField.listJets();
	}
}
