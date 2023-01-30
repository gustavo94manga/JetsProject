package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private List<Jet> jets = new ArrayList<>();
	private Scanner input = new Scanner(System.in);

	public AirField() {
		readTextFile();
	}

	public void readTextFile() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				Jet jet = null;
				String[] jetInfo = line.split(",");
				String name = jetInfo[0];
				String model = jetInfo[1];
				double speed = Double.parseDouble(jetInfo[2]);
				int range = Integer.parseInt(jetInfo[3]);
				long price = Long.parseLong(jetInfo[4]);

				if (name.equalsIgnoreCase("FighterJet")) {
					jet = new FighterJet(model, speed, range, price);
				} else if (name.equalsIgnoreCase("CargoPlane")) {
					jet = new CargoPlane(model, speed, range, price);
				} else if (name.equalsIgnoreCase("StealthBomber")) {
					jet = new StealthBomber(model, speed, range, price);
				} else if (name.equalsIgnoreCase("BombardierLearjet")) {
					jet = new BombardierLearjet(model, speed, range, price);
				} else if (name.equalsIgnoreCase("PilatusPC")) {
					jet = new PilatusPC(model, speed, range, price);
				}
				jets.add(jet);
//				System.out.println("Name: " + name + " Model: " + model + " Speed: " + speed + " Range: " + range
//						+ " Price: " + price);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	// Jet in place of void
	public Jet showFastestJet() {
		Jet fastest = jets.get(0);
		for (int i = 0; i < jets.size(); i++) {
			Jet current = jets.get(i);
			if (current.getSpeed() > fastest.getSpeed()) {
				fastest = current;
			}
		}
        return fastest;
	}

	// Jet in place of void
	public Jet longestRange() {
		Jet longestRange = jets.get(0);
		for (int i = 1; i < jets.size(); i++) {
			Jet current = jets.get(i);
			if (current.getRange() > longestRange.getRange()) {
				longestRange = current;
			}
		}
	        return longestRange;

	}

	public void listingJets() {
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}

	}
	
	public void flyJets() {
		for (Jet jet : jets) {
			if (jet instanceof Jet) {
				((Jet) jet).fly();
			}
		}
	}
	
	public void stealthBomberJet() {
		for (Jet jet : jets) {
			if (jet instanceof StealthBomber) {
				((StealthBomber) jet).fly();
			}
		}
	}
	
	public void bombardierJet() {
		for (Jet jet : jets) {
			if (jet instanceof BombardierLearjet) {
				((BombardierLearjet) jet).fly();
			}
		}
	}
	
	public void pilatusPC() {
		for (Jet jet : jets) {
			if (jet instanceof PilatusPC) {
				((PilatusPC) jet).fly();
			}
		}
	}

	public void fightJets() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}
	
	public void pilatusPCJetDogFight() {
		for (Jet jet : jets) {
			if (jet instanceof PilatusPC) {
				((PilatusPC) jet).fight();
			}
		}
	}
	
	public void BombardierJetDogFight() {
		for (Jet jet : jets) {
			if (jet instanceof BombardierLearjet) {
				((BombardierLearjet) jet).fight();
			}
		}
	}
	
	public void loadJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}
	
	public void bombsAway() {
		for (Jet jet : jets) {
			if (jet instanceof StealthBomber) {			
				((StealthBomber) jet).bombsAway();
			}
		}
	}
	
public void promptAddingJet() {
		
		System.out.println("Enter the Model name for the jet: ");
		String model = input.next();
		System.out.println("Enter the speed in MPH: ");
		double speed = input.nextDouble();
		input.nextLine();
		System.out.println("Please enter the range: ");
		int range = input.nextInt();
		input.nextLine();
		System.out.println("Please enter the unit price in US dollars: ");
		long price = input.nextLong();
		input.nextLine();
		
		Jet addJet = new JetImpl(model, speed, range, price);
		jets.add(addJet);
	}

public void removeJet() {
	boolean jetFound = false;
	System.out.println("Pick your index: ");
	for(int i = 0; i < jets.size(); i++) {
		System.out.println((i + 1) +" : " + jets.get(i));
	}
	int choice = input.nextInt();
	if(choice != 0) {
		jets.remove(choice - 1);
		jetFound = true;
	}
	if(jetFound) {
		System.out.println("Jet has been succesfully removed.");
	}
	else {
		System.out.println("There's no Jet at that index.");
	}
}


	public List<Jet> getJets() {
		System.out.println();
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

}
