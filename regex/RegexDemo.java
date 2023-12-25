package regex;

public class RegexDemo {

	public static void main(String[] args) {
		String name = "this is a laptop. And the make is dell";
		String[] splitthestring = name.split("\\.");
		for (int i = 0; i < splitthestring.length; i++) {
			System.out.println("the data in the array : "+splitthestring[i]);
		}
	}

}
