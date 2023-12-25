package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRegEx_Split {

	public static void main(String[] args) {
		String[] tokens="Hi! I am good. 24234y45 64 How 64565 645 about you?".split("[^0-9]+");

		      for (int i = 0; i<tokens.length; i++)
		         System.out.println("Token "+(i+1)+":"+tokens[i]);
	}
}
