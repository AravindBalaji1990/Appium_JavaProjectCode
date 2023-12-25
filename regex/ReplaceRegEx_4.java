package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRegEx_4 {

	public static void main(String[] args) {
		 String[] tokens="I ,am ,using ,the ,number ,89 ,and ,90".split(",");

		      for (int i = 0; i<tokens.length; i++)
		         System.out.println("Token "+(i+1)+":"+tokens[i]);
	}
}
