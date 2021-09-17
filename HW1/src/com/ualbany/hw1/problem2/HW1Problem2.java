package com.ualbany.hw1.problem2;

import java.util.Random;

public class HW1Problem2 {
	

	public static boolean multiple(int first, int second){
		if(first % second == 0){
			return true;
		} 
		else{
			return false;
		}
	}
	
	
	//remainder returns the remainder divided by 7

	public static int remainder(int numerator) {
		return numerator % 7;
	}
	

	public static double distance(double x1, double y1, double x2, double y2) {
	
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));	
	}
	
	//heads or tails 10 times
	public static void flipCoin() {
		
		int headCount = 0, tailCount = 0;
		
		//new instance of the Random object
		Random random = new Random();
		
		System.out.println(); 


		//loop 10 times of heads and tails
		for(int i = 0; i < 10; i++) {
			if (random.nextBoolean()) {
				System.out.println((i+1) + " Heads");
				headCount++;
			} else {
				System.out.println((i+1) + " Tails");
				tailCount++;
			}
		}
		
		System.out.println("\nHeads: " + headCount + " Tails: " + tailCount + ".\n");
	}
	
}
