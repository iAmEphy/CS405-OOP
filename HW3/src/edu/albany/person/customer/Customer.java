package edu.albany.person.customer;

import java.text.NumberFormat;
import edu.albany.person.Person;

public class Customer extends Person {
	
	//variables
	private double cash;

	//constructor
	public Customer(String newfirstname, String newlastname, double newcash) {

		this.setCash(newcash);

		this.setFirstname(newfirstname);

		this.setLastname(newlastname);
	}

	public double getCash() {

		return cash;

	}
	
	public void setCash(double cash) {

		this.cash = cash;

	}

	@Override
	public String toString() {

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		return this.getFirstname() + " " + this.getLastname() + " has " + formatter.format(this.getCash());

	}

	public void pay(double transactiontotal) {

		if((this.cash -= transactiontotal) > 0){

			this.cash -= transactiontotal;

		} 

		else{
			throw new IllegalArgumentException("\"Sorry, not enough money\".");
		} 
	}
}
