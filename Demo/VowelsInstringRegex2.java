package Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsInstringRegex2 {

	public static void main(String[] args) {
	VowelsInstringRegex2 obj = new VowelsInstringRegex2();
	System.out.println(obj.vowelCount("Aeiou"));
	}
	
	public int vowelCount(String str){

		int count = 0;

		if (str.length() > 0) {
			// Create a pattern that detects vowels.
			Pattern vowelPattern = Pattern.compile("[aeiou AEIOU]");
			Matcher vowelMatcher = vowelPattern.matcher(str);

			// Look for the next match and if found, add to count and repeat.
			while (vowelMatcher.find()){
				count++;
			}
			
		}

		return count;
	
	}
}
