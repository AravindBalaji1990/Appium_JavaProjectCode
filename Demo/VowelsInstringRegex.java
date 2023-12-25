package Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsInstringRegex {

	public static void main(String[] args) {
	VowelsInstringRegex obj = new VowelsInstringRegex();
	System.out.println(obj.vowelCount("The best is heree"));
	}
	
	public int vowelCount(String str){

		int count = 0;

		if (str.length() > 0) {
			// Create a pattern that detects vowels.
			Pattern vowelPattern = Pattern.compile("[aeiou]");
			Matcher vowelMatcher = vowelPattern.matcher(str);

			// Look for the next match and if found, add to count and repeat.
			while (vowelMatcher.find())
				count++;
		}

		return count;
	
	}
}
