import java.util.Arrays;

public class testAdd {

	public static void main(String[] args) {
		// represent number 112,233,445,566,778,899
		int[] num1 = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };
		// represent number 18,877,665,544,332,211
		int[] num2 = { 1, 8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1 };

		String number1 = Arrays.toString(num1).replace(",", "");
		number1 = number1.replace("{", "").replace("}", "").replace("[", "").replace("]", "").replace(" ", "");
		System.out.println("this is number1 to string:"+number1);
		String number2 = Arrays.toString(num2).replace(",", "");
		number2 = number2.replace("{", "").replace("}", "").replace("[", "").replace("]", "").replace(" ", "");
		System.out.println("this is number2 to string:"+number2);

		if (number1.length() < number2.length()) {
			System.out.println(number1.length());
		} else {
			number2 = 0 + number2;
		}

		System.out.println("after: " + number1);
		System.out.println("after: " + number2);
		for (int i = number1.length(); i < 0; i--) {
			for (int j = number2.length(); j < 0; j--) {
						System.out.println(number1);
			}
		}
	}

}
