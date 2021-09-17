package edu.albany.person.employee.cashier;

import java.text.NumberFormat;
import edu.albany.person.customer.Customer;
import edu.albany.person.employee.Employee;
import edu.albany.transaction.Transaction;

public class Cashier extends Employee{
	
	//variables
	private double cashregisteramount;
	
	public Cashier(String newfirstname, String newlastname, double newcashregisteramount) {

		this.setEmployeeid(count);

		this.setFirstname(newfirstname);

		this.setLastname(newlastname);

		this.setCashregisteramount(newcashregisteramount);
	}

	
	public double getCashregisteramount() {

		return cashregisteramount;

	}


	public void setCashregisteramount(double cashregisteramount) {

		this.cashregisteramount = cashregisteramount;

	}

	@Override
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return this.getFirstname() + " " + this.getLastname() + " employee id " + this.getEmployeeid() + " has " + formatter.format(this.getCashregisteramount());
	}


	public void receive(double transactiontotal) {

		this.cashregisteramount += transactiontotal;
		
	}

	public void authenticate(Customer customer, Cashier cashier, Transaction testtransaction) {

		double transactiontotal = testtransaction.getPrice() + testtransaction.getTax();

		customer.pay(transactiontotal);

		cashier.receive(transactiontotal);

	}
}
