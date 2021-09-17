package edu.albany.person.employee;

import edu.albany.person.Person;


public abstract class Employee extends Person{
	
	//variable
	protected static int count;
	private int employee_id;

	
	public static int getCount() {

		return count;

	}
	
	public static void setCount(int count) {

		Employee.count = count;

	}
	
	public int getEmployee_id() {

		return employee_id;

	}
	
	public void setEmployee_id(int employee_id) {

		this.employeeid = employeeid;

	}

	public abstract String toString();

}
