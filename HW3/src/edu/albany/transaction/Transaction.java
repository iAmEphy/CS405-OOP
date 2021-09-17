package edu.albany.transaction;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import edu.albany.person.customer.Customer;
import edu.albany.person.employee.cashier.Cashier;
import edu.albany.person.employee.sandwichmaker.SandwichMaker;
import edu.albany.problem2.Menu.Sandwich;


public class Transaction {
	
	//Variable
	private static int ordernumber = 0;

	private Sandwich[] order;


	public Sandwich[] getOrder() {

		return order;

	}

	public void setOrder(Sandwich[] order) {

		this.order = order;

	}

	public static int getOrdernumber() {

		return ordernumber;

	}
	
	public static void setOrdernumber(int ordernumber) {

		Transaction.ordernumber = ordernumber;

	}
	
	public double getPrice() {
		
		final DecimalFormat df = new DecimalFormat("#.##");

		double count = 0;

		for(Sandwich s : this.getOrder()) {

			count += s.getPrice();
		}

		return Double.parseDouble(df.format(count));
	}
	

	public double getTax() {
		
		final DecimalFormat df = new DecimalFormat("#.##");

		double count = 0;

		for(Sandwich s : this.getOrder()) {

			count += s.getPrice();

		}
		
		//Add tax
		count = (count * 0.06625);

		return Double.parseDouble(df.format(count));

	}


	public Transaction(Sandwich[] neworder){
		
		this.order = neworder;

		ordernumber++;
	}
	
	//print receipt
	public void printReceipt(Customer customer, Cashier cashier, SandwichMaker cook) {

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		String seperator = "-------------------------";

		System.out.println(seperator);

		System.out.println("Order # " + Transaction.getOrdernumber() + "): ");

		System.out.println(seperator);

		System.out.println(String.format("%-25s%s" , "Type", "Price"));

		System.out.println(seperator);
		
		for(Sandwich s : this.getOrder()) {

			System.out.println(s.toString());

		}
		
		System.out.println(seperator);

		System.out.println(String.format("%-25s%s" , "Tax", formatter.format(this.getTax())));

		System.out.println(String.format("%-25s%s" , "Total", formatter.format(this.getPrice()+this.getTax())));

		System.out.println(seperator);

	}
}
