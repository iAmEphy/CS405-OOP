package edu.albany.hw4.binaryword;

import java.util.BitSet;

import edu.albany.hw4.Complementable;

public class BinaryWord implements Complementable<BitSet>{
	
	//variable
	private BitSet word;
	
	public BinaryWord() {}
	
	public BinaryWord(String newWord) {

		int length = newWord.length();

		word = new BitSet(length);

		for(int x = 0; x < length; x++) {

			if(newWord.charAt(x) == '1') {

				word.set(x, true);

			} 
			else if (newWord.charAt(x) == '0') {

				word.set(x, false);

			} 
			else {

				this.setWord(null);

			}
		}
		
		this.setWord(word);
	}
	
	
	public BinaryWord complement() {
			
		
		int length = this.getWord().length();

        StringBuilder newWord = new StringBuilder();

		
		for(int x = 0; x < length; x ++) {

			if(this.getWord().get(x) == true) {

				newWord.append('0');

			} 
			else if(this.getWord().get(x) == false) { 

				newWord.append('1'); 

			} 
			else {

				return null;

			}
		}

		BinaryWord complementable = new BinaryWord(newWord.toString());

		return complementable;		
	}

	@Override
	public String toString() {
		
		//integer length 
		int length = this.getWord().length();

        StringBuilder newWord = new StringBuilder();

		
		//loop
		for(int x = 0; x < length; x ++) {

			if(this.getWord().get(x) == true) {

				newWord.append('1');

			} 
			else if(this.getWord().get(x) == false) { 

				newWord.append('0');

			} 
			else {
				return null;
			}
		}
		
		return newWord.toString();
		
	}

	
	@Override
	public boolean equals(Object word) {
		
		if (this == word){

			return true;

		}
		if (word == null){

			return false;

		}
		
		
		if (getClass() != word.getClass()){

			return false;

		} 
		
		BinaryWord other = (BinaryWord) word;

		if(this.getWord().equals(other.getWord())) {

			return true;

		} 
		else {

			return false;

		}
	}
	
	//getters and setters
	public BitSet getWord() {

		return word;

	public void setWord(BitSet word) {

		this.word = word;

	}	
}
