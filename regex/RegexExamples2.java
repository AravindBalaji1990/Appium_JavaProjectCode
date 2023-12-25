package regex;

import java.util.regex.Pattern;

public class RegexExamples2 {

	public static void main(String[] args) {
		String data = "this is a  word\r\n can i use this";
		System.out.println("input : " +data );
		System.out.println(Pattern.matches("\\D", data));
		data = data.replaceAll("(\r\n|\n\r|\r|\n)", "");
		System.out.println(data);
	}

}
