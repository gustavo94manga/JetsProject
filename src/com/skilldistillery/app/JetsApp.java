package com.skilldistillery.app;

import java.util.Scanner;

import com.skilldistillery.entities.AirField;

public class JetsApp {
	private AirField airF = new AirField();
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp call = new JetsApp();
		call.launch();
		
	}

	private void launch() {
		airF.getJets();
		String option;
		boolean running = true; //
		do {
			System.out.println("Please choose a number from the Menu:");
			System.out.println("---------------MENU---------------");
			System.out.println("1. List Fleet");
			System.out.println("2. To know length of flight of each based on Speed and Range, press 2");
			System.out.println("3. View the fastest jet");
			System.out.println("4. View jet with Longest Range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dog Fight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Drop bombs");
			System.out.println("10. Quit");

			option = input.nextLine();

			switch (option) {
			case "1":
				System.out.println("Listing Fleet...." + "\n");
				airF.listingJets();
				break;

			case "2":
				System.out.println("Flying all jets...determining travel duration... " + "\n");
				airF.flyJets();
				break;

			case "3":
				System.out.println("Viewing Fastest Jet... " + "\n");
				System.out.println(airF.showFastestJet()); 	
				
				break;
			case "4":
				System.out.println("View Jet with longest Range... " + "\n");
				System.out.println(airF.longestRange());
				break;
			case "5":
				System.out.println("Loading all Cargo on transport... " + "\n");
				airF.loadJets();
				break;
			case"6":
				System.out.println("Dog Fight!!! " + "\n");
				airF.fightJets();
				airF.pilatusPCJetDogFight();
				airF.BombardierJetDogFight();
				break;
			case "7":
				System.out.println("Adding your jet to the Fleet. " + "\n");
				airF.promptAddingJet();
				break;
			case "8":
				System.out.println("Removing the jet from the Fleet. " + "\n");
				airF.removeJet();
				break;
			case "9":
				System.out.println("Dropping bombs, in 3...2...1... ");
				airF.bombsAway();
				break;
			case "10":
			case "Quit":
			case "quit":
				System.out.println("Thank you for your input, have a nice day");
				running = false;
				break;

			default:
				System.err.println("Error: Please enter an appropriate option. \n");

			}
		} while (running);

	}
	


}
