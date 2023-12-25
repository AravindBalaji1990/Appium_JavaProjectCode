package Demo;


public class Factorial {

	public static void main(String[] args) {
		// Scanner object for capturing the user input
		// Called the user defined function fact
		int factorial = fact(5);
		System.out.println("Factorial of entered number is: " + factorial);

	}

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}
		// Recursion: Function calling itself!!
		output = fact(n - 1) * n;
		return output;
	}

}
