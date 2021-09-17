package com.ualbany.hw1.problem3;

public class Address {
	
	private String addressLine1; 
	private String addressLine2;
	private String City;
	private String State;
	private String Zip;
	
	//Constructor(s)
	public Address(String addressLine1, String addressLine2, String city, String state, String zip) {
		this.addressLine1 = addressLine1;

		this.addressLine2 = addressLine2;

		City = city;

		State = state;

		Zip = zip;

	}
	
	//getter and setters
	public String getAddressLine1() {

		return addressLine1;

	}
	
	public void setAddressLine1(String addressLine1) {

		this.addressLine1 = addressLine1;

	}
	
	public String getAddressLine2() {

		return addressLine2;

	}
	
	public void setAddressLine2(String addressLine2) {

		this.addressLine2 = addressLine2;

	}
	
	public String getCity() {

		return City;

	}
	
	public void setCity(String city) {

		City = city;

	}
	
	public String getState() {

		return State;

	}
	
	public void setState(String state) {

		State = state;

	}

	public String getZip() {

		return Zip;

	}
	
	public void setZip(String zip) {

		Zip = zip;

	}

	
	@Override
	public String toString() {
		return "\tAddress Line 1 " + addressLine1 + "\n\tAddress Line 2 " + addressLine2 + "\n\tCity " + City + "\n\tState " + State + "\n\tZip " + Zip + "\n";
	}

}
