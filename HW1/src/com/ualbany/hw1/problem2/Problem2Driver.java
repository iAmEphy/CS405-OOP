package com.ualbany.hw1.problem2;


import java.util.Scanner;

public class Problem2Driver extends HW1Problem2{

	
	public static void main(String[] args) {
		
		//users input
		Scanner scanner = new Scanner(System.in);
		int userInput;
		
		System.out.println("Pick a function\n"
				+ "\t0. End\n"
				+ "\t1. multiply\n"
				+ "\t2. remainder\n"
				+ "\t3. distance of x and y\n"
				+ "\t4. flip coin 10 times\n"
				+ "Please enter a # from 0-4:");

		//loop till 0 to end
		while(true) {
			
			//user input
			userInput = scanner.nextInt();
			
			//End
			if (userInput == 0) {
				 System.out.println("Ending");
				 break;
				 
			}

			//multiply
			else if (userInput == 1) {
				
				
				@SuppressWarnings("resource")
				Scanner scan1 = new Scanner(System.in);
				int first, second;
				
				//Accept user input
				System.out.println("Enter numerator ");

				first = scan1.nextInt();

				System.out.println("Enter denominator ");

				second = scan1.nextInt();
				
				//Print answer
				if (multiple(first, second) == true) {
					System.out.println("It divided evently" + first + " % " + second + "| = " + first%second + ".\n");
				} else {
					System.out.println("It didn't divide evenly" + first + " % " + second + "| = " + first%second  + ".\n");
				}
				
			}
			//remainder
			else if (userInput == 2) {

				//New scanner and variables for function arguments
				@SuppressWarnings("resource") //Suppressed because you don't want to close System.in
				Scanner scan2 = new Scanner(System.in);
				int numerator;
				
				//Accept user input
				System.out.println("\nPlease enter the numerator ");
				numerator = scan2.nextInt();
				
				//Print answer to cmdline
				if (remainder(numerator)==0) {
					System.out.println("It divided evently " + numerator + " % 7 = " + remainder(numerator) + ".\n");
				} else {
					System.out.println("It didn't divide evenly " + numerator + " % 7 = " + remainder(numerator) + ".\n");
				}
				
			} 
			//distance
			else if (userInput == 3) {

				
				Scanner scan3 = new Scanner(System.in);
				double x1, y1, x2, y2;
				
				//Accept user input
				System.out.println("Please enter x1 ");
				x1 = scan3.nextDouble();
				System.out.println("Please enter y1 ");
				y1 = scan3.nextDouble();
				
				System.out.println("Please enter x2 ");
				x2 = scan3.nextDouble();
				System.out.println("Please enter y2 ");
				y2 = scan3.nextDouble();
				
				//Print answer to cmdline
				System.out.println("distance between a point 1(" + x1 + "," + y1 + ") and a point 2 (" + x2 + "," + y2 + ") is: " + distance(x1, y1, x2, y2) + ".\n");
				
			} 
			//flip coin 10 times
			else if (userInput == 4) {
				flipCoin();
				
			} else {
				System.out.println("\nERROR\n");
				
			}
			
			//Print out prompt
			System.out.println("Please enter a # from 0-4");

		}
		
		//Close the scanner
		scanner.close();	
		System.out.println("Ending");
	}
}
