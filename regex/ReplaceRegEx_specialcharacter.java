package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRegEx_specialcharacter {

	public static void main(String[] args) {
	System.out.println("String is = " + getOnlyStrings("!&(*^*$(^(+one(&(^ONE()(*)(*&^%$#@!#$%^&*()("));
		System.out.println("Number is = " +
		getOnlyDigits("&(*^*(^(+91-&*9hi-639-0097(&(^("));
		//System.out.println("Number is = " + getOnlyStringFromSpl("hjdg$h&jk8^i0ssh6"));
		
		//System.out.println("Vowel find = " + getOnlyWhitespaces("This is a test"));

	}

	public static String getOnlyDigits(String s) {
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}

	public static String getOnlyStrings(String s) {
		Pattern pattern = Pattern.compile("[^a-z A-Z]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}
	
	public static String getOnlyStringFromSpl(String s) {
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}
	
	public static String getOnlyVowels(String s) {
		Pattern pattern = Pattern.compile("[aeiou AEIOU]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}
	
	public static String getOnlyWhitespaces(String s) {
		Pattern pattern = Pattern.compile("\\w.*");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}

}
