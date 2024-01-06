package Examples;

import java.util.StringTokenizer;

public class ExamplesTokenizer {

	public static void main(String[] args) {
		//String tokenizer with delimiter example
		String msg = "This program gives sample code for String Tokenizer"; 
		StringTokenizer st = new StringTokenizer(msg," ");
		System.out.println("Count: "+st);
		 System.out.println("Count: "+st.countTokens());
	}

}
