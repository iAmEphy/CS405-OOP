package edu.albany.hw2.morse;


public class MorseCode {
	
	public enum Morse {
		
		
	    SPACE(' ', "/"), 
	    COMMA(',', "--..--"),
	    PERIOD('.', ".-.-.-"),
	    QUESTIONMARK('?', "..--.."),
	   
		ZERO('0', "-----"),
	    ONE('1', ".----"),
	    TWO('2', "..---"),
	    THREE('3', "...--"),
	    FOUR('4', "....-"),
	    FIVE('5', "....."),
	    SIX('6', "-...."),
	    SEVEN('7', "--..."),
	    EIGHT('8', "---.."),
	    NINE('9', "----."),

	    //Characters
		A(".-"),
	    B("-..."),
	    C("-.-."),
	    D("-.."),
	    E("."),
	    F("..-."),
	    G("--."),
	    H("...."),
	    I(".."),
	    J(".---"),
	    K("-.-"),
	    L(".-.."),
	    M("--"),
	    N("-."),
	    O("---"),
	    P(".--."),
	    Q("--.-"),
	    R(".-."),
	    S("..."),
	    T("-"),
	    U("..-"),
	    V("...-"),
	    W(".--"),
	    X("-..-"),
	    Y("-.--"),
	    Z("--..");
		
		//variable
	    private char c;

	    private String morsecode;

	    //Constructor
	    private Morse(char c, String morsecode) {

	        this. = c;

	        this.morsecode = morsecode;

	    }

	    private Morse(String morsecode) {

	        this.c = this.name().charAt(0);

	        this.morsecode = morsecode;
	    }
	    
		
		public char getChar() {

			return c;

		}

		public String getCode() {

			return morsecode;

		}

	}
	
	//String buffer
	public static StringBuffer stringToMorseCode(String inString) {
		
		StringBuffer stringBuffer = new StringBuffer();
		
		for (char c : inString.toCharArray()){
			
			if(c == '\n') {
				
				stringBuffer.append("\n");

				break;
			}
			
			//check if its null
			else if(letterToMorseCode(ch) == null) {
				return null;
			}
			
			stringBuffer.append(letterToMorseCode(ch) + " ");

		}
		
		//return
		return stringBuffer;
	}
	
	
	private static String letterToMorseCode(char letter) {
		
		for(Morse searcher: Morse.values()) {
			
			if(searcher.getChar() == Character.toUpperCase(letter)) {

                return searcher.getCode();

            }
		}
		
		//return null
		return null;
	
	}
	
}