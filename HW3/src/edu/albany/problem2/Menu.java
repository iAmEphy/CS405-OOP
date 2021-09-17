package edu.albany.problem2;


public class Menu {

	public enum Sandwich {
		


	    MAYO("MAYO Sandwich", 1.11), 
	    KETCHUP("Ketchup Sandwich", 2.22),
	    CHICKEN("Chicken Sandwich", 3.33);
	
		//variables
		private String name;

		private double price;
		
		//number of items
		private static int count = 3;
		
		//Constructor
		Sandwich(String newname, double newprice) {

			this.name = newname;

			this.price = newprice;

		}

		public String getName() {

			return name;
		}

		
		public double getPrice() {

			return price;

		}

		
		public static int getCount() {

			return count;

		}
		
		
		public String toString() {
			return String.format("%-25s$%s" , this.getName(), this.getPrice());
		}
		
		
		public static void printMenu() {
			String seperator = "-------------------";
			
			System.out.println("Menu\n" + seperator);

			System.out.println(String.format("%-25s%s" , "Type", "Price" + "\n" + seperator));

			for(Sandwich s: Sandwich.values()) {

				System.out.println(s);

			} System.out.println(seperator);
		}
	}
}
