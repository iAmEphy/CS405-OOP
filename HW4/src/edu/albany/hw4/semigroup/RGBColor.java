package edu.albany.hw4.semigroup;

import edu.albany.hw4.Complementable;


public class RGBColor extends SemiGroup<RGBColor> implements Complementable<RGBColor>{

	//Variables
	private int r;
	private int g;
	private int b;
	
	//Constructor
	public RGBColor() {}
	
	public RGBColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	
	@Override
	public RGBColor complement() {

		return new RGBColor(255 - this.getR(), 255 - this.getG(), 255 - this.getB());

	}

	
	@Override
	public RGBColor operate(RGBColor other) {

		int avgr = (this.getR() + other.getR())/2;

		int avgg = (this.getG() + other.getG())/2;

		int avgb = (this.getB() + other.getB())/2;

		return new RGBColor(avgr, avgg, avgb);
	}

	
	public int getR() {

		return r;

	}

	
	public void setR(int r) {

		this.r = r;

	}

	
	public int getG() {

		return g;

	}

	
	public void setG(int g) {

		this.g = g;

	}

	
	public int getB() {
		return b;
	}

	
	public void setB(int b) {

		this.b = b;

	}

	
	@Override
	public String toString() {
		return "(" + r + ", " + g + ", " + b + ")";
	}

	
	@Override
	public boolean equals(Object other) {
		
		if (this == other){

			return true;

		}
		if (other == null){

			return false;

		}
		
		if (getClass() != other.getClass()){

			return false;

		}
		//type cast and compare
		RGBColor castother = (RGBColor) other;

		if (b != castother.b){

			return false;

		}

		if (g != castother.g){

			return false;

		}
		if (r != castother.r){

			return false;

		}
		
		return true;
	}
}
