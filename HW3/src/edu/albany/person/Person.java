package edu.albany.person;

public abstract class Person {
	
	//variables
	private String firstname;

	private String lastname;

	//getter and setters
	public String getFirstname() {

		return firstname;

	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getName() {

		return firstname.toCharArray()[0] + ". " + lastname;

	}
	
	public abstract String toString();
	
}
