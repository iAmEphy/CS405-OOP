package edu.albany.person.employee.sandwichmaker;

import edu.albany.person.employee.Employee;
import edu.albany.problem2.Menu.Sandwich;
import edu.albany.transaction.Transaction;

public class SandwichMaker extends Employee{
	
	private Transaction currenttransaction;
	
	//Constructor
	public SandwichMaker(String newfirstname, String newlastname, Transaction currentorder) {

		this.setEmployeeid(count);

		this.setFirstname(newfirstname);

		this.setLastname(newlastname);

		this.setCurrenttransaction(currentorder);

	}


	public Transaction getCurrenttransaction() {

		return currenttransaction;

	}
	
	public void setCurrenttransaction(Transaction currenttransaction) {

		this.currenttransaction = currenttransaction;

	}
	
	public void completeOrder() {

		if(this.getCurrenttransaction().getOrder() != null) {

			System.out.println("\n\t\"Starting order " + Transaction.getOrdernumber() + "!\"\n");

			for(Sandwich s : this.getCurrenttransaction().getOrder()) {

				System.out.println("\t" + s.getName());

			}			
		
			System.out.println("\n\t\"Come order\"");

		} else {

			System.out.println("\n\t\"No orders!\"");
		}
	}

	@Override
	public String toString() {
		return this.getName();
	}

}
