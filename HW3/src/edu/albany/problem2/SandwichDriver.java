package edu.albany.problem2;

import java.text.NumberFormat;
import java.util.Random;
import edu.albany.person.customer.Customer;
import edu.albany.person.employee.cashier.Cashier;
import edu.albany.person.employee.sandwichmaker.SandwichMaker;
import edu.albany.problem2.Menu.Sandwich;
import edu.albany.transaction.Transaction;

public class SandwichDriver {

	public static void main(String[] args) {
		
		//Currency
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//customer cashier and cook
		Customer customer = new Customer("Bob", "Bob2", 20.00); 

		Cashier cashier = new Cashier("Mike", "Mike2", 200.00);

		SandwichMaker cook = new SandwichMaker("Cook", "Cook2", null); 
		//print menu
		Menu.Sandwich.printMenu();

		
		System.out.println("\n\t\"What do you want?\"");

		Random rand = new Random();

		int numsandwiches = rand.nextInt(Sandwich.getCount()) + 1;
		
		int temp;

		
		Sandwich[] sandwichesordered = new Sandwich[numsandwiches];
		for(int i = 0; i < numsandwiches; i++) {
			temp = rand.nextInt(Sandwich.getCount())+1;
			switch (temp) {
	        	case 1:  sandwichesordered[i] = Sandwich.MAYO;
	            	break;
	            case 2:  sandwichesordered[i] = Sandwich.KETCHUP;
	                break;
	            case 3:  sandwichesordered[i] = Sandwich.CHICKEN;
	                break;	
			}
		}

		System.out.print("\n\t\"I want ");
		for(Sandwich s: sandwichesordered) {

			System.out.print("\n\t " + s.getName());

		} System.out.println("\"");

		
		Transaction testtransaction = new Transaction(sandwichesordered);

		
		
		System.out.println("\n\t\"You owe me " + formatter.format(testtransaction.getPrice() + testtransaction.getTax()) + " Don't forget tax hehe "+ ".\"");
		
		try {
			
			cashier.authenticate(customer, cashier, testtransaction);
			
		} catch(Exception e) {
			System.out.println("\n\t" + e.getLocalizedMessage());
			return;
		}
		
		//print receipt
		testtransaction.printReceipt(customer, cashier, cook);

		cook.setCurrenttransaction(testtransaction);

		cook.completeOrder();
	}
}
