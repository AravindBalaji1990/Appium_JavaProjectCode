package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRegEx_2 {

	public static void main(String[] args) {
		 String[] tokens="Hi! I am good. How about you?".split("\\.");

		      for (int i = 0; i<tokens.length; i++)
		         System.out.println("Token "+(i+1)+":"+tokens[i]);
	}
}
