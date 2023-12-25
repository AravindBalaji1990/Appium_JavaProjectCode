package StringFunctions;

public class StringToChar2 {

	public static void main(String[] args) {
		 String str = "Copy chars from this string";
	        char[] ch = new char[10];
	        /**
	         * The getChars() method accepts 4 parameters
	         * first one is the start index from string
	         * second one is the end index from string
	         * third one is the destination char array
	         * forth one is the start index to append in the
	         * char array.
	         */
	        str.getChars(5, 10, ch, 0);
	        System.out.println(ch);
	}

}
