package com.ualbany.hw1.problem3;

public class CheckingBankAccount {
	
	//variables
	private double value;
	
	
	public void withdraw(double withdrawmoney) {

		this.value -= withdrawmoney;

	}
	
	
	public void deposit(double depositmoney) {

		this.value += depositmoney;

	}
	
	//getter and setters
	public double getValue() {
		return value;
	}

	
	public void setValue(double value) {
		this.value = value;
	}
	
	//Constructor(s)

	public CheckingBankAccount(double value) {
		this.value = value;
	}
	
}
