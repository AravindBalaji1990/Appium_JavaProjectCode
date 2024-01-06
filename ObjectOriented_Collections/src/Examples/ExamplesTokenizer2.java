package Examples;

import java.util.StringTokenizer;

public class ExamplesTokenizer2 {

	public static void main(String[] args) {
		//String tokenizer with more delimieter delimiter example
		 String msg = "http://10.123.43.67:80/";
	        StringTokenizer st = new StringTokenizer(msg,"://.");
	        while(st.hasMoreTokens()){
	            System.out.println(st.nextToken());
	        }
	}

}
