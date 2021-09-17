package edu.albany.problem1;

import edu.albany.cargo.CargoShip;
import edu.albany.cruise.CruiseShip;

public class ShipDriver {

	public static void main(String[] args) {
		
		Ship[] shipArray = new Ship[6];

		Ship test1 = new Ship("Ship 1", "2001");
		Ship test2 = new Ship("Ship 2", "2002");

		CargoShip testCargo = new CargoShip("Test Cargo 1", "2003", 101);
		CargoShip testCargo2 = new CargoShip("Test Cargo 2", "2004", 102);

		CruiseShip testCruise = new CruiseShip("Cruise 1", "2005", 103);
		CruiseShip testCruise2 = new CruiseShip("Cruise 2", "2006", 104);

		shipArray[0] = test1;
		shipArray[1] = test2;
		shipArray[2] = testCargo;
		shipArray[3] = testCargo2;
		shipArray[4] = testCruise;
		shipArray[5] = testCruise2;
		
		//print out the whole array
		for(int i = 0; i < shipArray.length; i++){
			System.out.println(shipArray[i].toString() + "\n");
		}
	}

}
