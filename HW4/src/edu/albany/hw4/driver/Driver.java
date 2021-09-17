package edu.albany.hw4.driver;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;

import edu.albany.hw4.binaryword.BinaryWord;
import edu.albany.hw4.semigroup.PositiveInteger;
import edu.albany.hw4.semigroup.RGBColor;


public class Driver {

	public static void main(String[] args) {
		
		BinaryWord test1 = new BinaryWord("00000000000000000001010101000010011");
		BinaryWord test2 = new BinaryWord("00000000000000000010101000000000001");

		System.out.printf("\n%-15s%-22s\n","test1:", test1);

		System.out.printf("%-15s%-22s\n","complement ", test1.complement());

		System.out.printf("\n%-15s%-22s\n","test2:", test2);

		System.out.printf("%-15s%-22s\n","complement ", test2.complement());

		System.out.println("\nPositive int test\n");

		int sum = 0;

		PositiveInteger operateSum = new PositiveInteger(0);

		PositiveInteger[] posInts = new PositiveInteger[10];

		Random rand = new Random();

		Collection<PositiveInteger> collection =  new ArrayList<PositiveInteger>();
		
		
		for(int i = 0; i < 10; i++) {

			PositiveInteger temp  = new PositiveInteger(rand.nextInt(250) + 1);

			posInts[i] = temp;

			System.out.println("\"Positive Integer\" " + posInts[i]);

			sum += posInts[i].getValue();

			operateSum.setValue(operateSum.operate(posInts[i]).getValue());

			collection.add(temp);
		}
		
	
	}
}
