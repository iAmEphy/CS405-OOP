package edu.albany.hw2.car;

public class FuelGauge {
	
	//variables
	private double currentFuel;

	//Constructor
	public FuelGauge(double currentFuel) {
		this.currentFuel = currentFuel;
	}
	
	public FuelGauge() {

		this.currentFuel = 0;

	}
	
	//getters and setters
	public double getCurrentFuel() {

		return currentFuel;

	}

	public void setCurrentFuel(double currentFuel) {

		this.currentFuel = currentFuel;

	}
	
	public void incrementFuel() {

		if(this.currentFuel < 15) {

			currentFuel ++;

		}
	}
	
	public void decrementFuel() {

		if(this.currentFuel > 0) {

			currentFuel --;
			
		}
	}
}
