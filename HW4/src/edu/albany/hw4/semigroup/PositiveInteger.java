package edu.albany.hw4.semigroup;


public class PositiveInteger extends SemiGroup<PositiveInteger> {

	//variables
	private int value;
	
	
	public PositiveInteger(int value) {

		this.setValue(value);

	}

	
	@Override
	public PositiveInteger operate(PositiveInteger other) {

		return new PositiveInteger(this.getValue() + other.getValue());

	}

	
	public int getValue() {

		return value;

	}

	
	public void setValue(int value) {

		this.value = value;

	}

	
	@Override
	public String toString() {

		return String.valueOf(this.getValue());

	}

	
	public boolean equals(PositiveInteger num) {

		if (this == num){

			return true;

		}
		if (num == null){

			return false;

		}
		
		if (getClass() != num.getClass()){

			return false;

		}
		PositiveInteger other = (PositiveInteger) num;
		
		if (this.getValue() != other.getValue()) {

			return false;

		}

		return true;
	}
}
