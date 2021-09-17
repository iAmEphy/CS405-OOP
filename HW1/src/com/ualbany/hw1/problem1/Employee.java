package com.ualbany.hw1.problem1;

import java.text.DecimalFormat;

public class Employee {
	
	//first name last name and salary
	private String firstName;
	private String lastName;
	private double Salary;
	
	//Constructor

	public Employee(String firstName, String lastName, double Salary) {

		this.firstName = firstName;

		this.lastName = lastName;
		
		//salary can only be positive
		if(Salary < 0) {

			this.Salary = 0.0;

		} 

		else {

			this.Salary = Salary;

		}
	}
	
	/** 
	 * @return the yearly salary of an Employee
	 */
	public double getYearlySalary() {

		return this.getMonthlySalary() * 12.0;

	}
	

	public void giveRaise(double decimalToRaise) {
		
		
		double currentMonthlySalary = this.getMonthlySalary();

		this.setMonthlySalary(currentMonthlySalary + (decimalToRaise * currentMonthlySalary));

	}
	
	
	@Override
    public String toString() {
   
    	//2 decimal places
    	DecimalFormat money = new DecimalFormat("#.00"); 
    			
        return "The yearly salary of " + this.getFirstName() + " " + this.getLastName()
			 + " is: $" + money.format(this.getYearlySalary()) + ".";
    }
    
    //getters and setters
	public String getLastName() {

		return lastName;

	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public double getMonthlySalary() {
		return Salary;
	}
	
	public void setMonthlySalary(double Salary) {
		this.Salary = Salary;
	}
	
	
}
