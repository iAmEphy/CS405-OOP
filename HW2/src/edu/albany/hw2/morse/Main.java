package edu.albany.hw2.morse;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		//variables
		int arg;
		String input;
				
		arg = args.length;
		
		
		if(arg != 0) {
			
			if (arg == 1) {
				
				//Print text
				System.out.println("\nMorse code ");
				
				//check if its null
				if(MorseCode.stringToMorseCode(args[0]).equals(null)) {
					System.out.println("Error");
				} 
				else{
					System.out.println(MorseCode.stringToMorseCode(args[0]));
				}
				
				
			} 
			else{ 
				System.out.println("Too many errors");
			}

		} else {
			
			//Print
			System.out.println("Please enter a string to convert ");
		
			//user input
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
			
			//print
			System.out.println("\nMorse code ");
			
			
			if(MorseCode.stringToMorseCode(input) == null) {
				System.out.println("Error again my dude");
			} else {
				System.out.println(MorseCode.stringToMorseCode(input));
			}
		}

	}

}
