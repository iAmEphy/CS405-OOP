package com.ualbany.hw1.problem3;

import java.text.DecimalFormat;


public class Bank {

	public static void main(String [] args) {
		
		
		//new addresses
		Address personAddress = new Address("1234 Something St.", "Floor", "Albany", "New York" , "11111");
		Address bankAddress = new Address("4321 Something St.", "Floor", "Albany", "New York" , "11111");
		
		//bank and person
		Person aPerson = new Person("Bob", "Bob1", personAddress, null);
		Bank aBank = new Bank("Bob Bank", bankAddress, null);
		
		//print their info
		System.out.println("Person name " + aPerson.getFirstName() + " " + aPerson.getLastName() + ".");
		System.out.println("Bank name " + aBank.getName() + ".\n");

		//adding 1000$
		System.out.println("Adding $1000 ");

		CheckingBankAccount aAccount = new CheckingBankAccount(1000);

		//Assign bank to person
		aPerson.setBankAccount(aAccount); 


		aBank.setAccount(aAccount); 
		
	}
	
	//variables:
	private String name;

	private Address localAddress;

	private CheckingBankAccount Account;

	
	//getter and setters
	public String getName() {

		return name;

	}
	
	public void setName(String name) {

		this.name = name;

	}
	
	public Address getLocalAddress() {

		return localAddress;

	}
	
	public void setLocalAddress(Address localAddress) {

		this.localAddress = localAddress;

	}
	
	public CheckingBankAccount getAccount() {

		return Account;

	}
	
	public void setAccount(CheckingBankAccount account) {

		Account = account;

	}
	
	
	public Bank(String name, Address localAddress, CheckingBankAccount account) {

		this.name = name;

		this.localAddress = localAddress;

		Account = account;
	}
	
	public static void printReceipt(Person person) {
		//Creates a new decimal format that rounds to two decimal points, i.e. money
    	DecimalFormat money = new DecimalFormat("#.00");
    	
		System.out.println("-----Receipt-----\n"
				+ "\tFirst Name " + person.getFirstName() + "\n"
				+ "\tLast Name " + person.getLastName() + "\n"
				+ person.getHomeAddress().toString() 
				+ "\tBalance of $" + money.format(person.getBankAccount().getValue())
				+ "\n-----------------------");
	}
}
