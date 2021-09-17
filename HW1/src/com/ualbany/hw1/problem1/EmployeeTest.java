package com.ualbany.hw1.problem1;


public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println("Before their raise");
		
		//2 employees
		Employee employee1 = new Employee("Bob1", "Bob2", 1000.10);
		Employee employee2 = new Employee("Mike", "Smith", 2000.20);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());

		//10% raise
		employee1.giveRaise(.10);
		employee2.giveRaise(.10);

		System.out.println("\nAfter a 10% raise: ");
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());

	}

}
