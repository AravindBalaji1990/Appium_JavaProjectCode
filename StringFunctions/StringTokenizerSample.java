package StringFunctions;

import java.util.StringTokenizer;

public class StringTokenizerSample {

	public static void main(String[] args) {
		String str = "This is a * string object";
		StringTokenizer st = new StringTokenizer(str,"*"); 
		while ( st.hasMoreTokens() ) {
			System.out.println(st.nextToken() );  
			}
	}

}
