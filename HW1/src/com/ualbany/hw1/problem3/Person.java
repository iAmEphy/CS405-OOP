package com.ualbany.hw1.problem3;


public class Person {
	
	//variables:
	private String firstName;
	private String lastName;
	private Address homeAddress;
	private CheckingBankAccount bankAccount;
	
	//Constructor
	public Person(String firstName, String lastName, Address homeAddress, CheckingBankAccount bankAccount) {

		this.firstName = firstName;

		this.lastName = lastName;

		this.homeAddress = homeAddress;

		this.bankAccount = bankAccount;

	}
	
	//Getters and Setters:

	
	public String getFirstName() {

		return firstName;

	}
	
	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}
	
	public String getLastName() {

		return lastName;

	}
	
	public void setLastName(String lastName) {

		this.lastName = lastName;

	}
	
	public Address getHomeAddress() {

		return homeAddress;

	}
	
	public void setHomeAddress(Address homeAddress) {

		this.homeAddress = homeAddress;

	}
	
	public CheckingBankAccount getBankAccount() {

		return bankAccount;

	}
	
	public void setBankAccount(CheckingBankAccount bankAccount) {

		this.bankAccount = bankAccount;
		
	}
	
}
