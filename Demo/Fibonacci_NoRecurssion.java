package Demo;

import java.util.Scanner;

public class Fibonacci_NoRecurssion {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);// runtime we can get the input
												// values
		int a = 1, b = 1, c = 0, t;
		System.out.println("Enter the value of t:");
		t = input.nextInt();
		System.out.println(a);
		System.out.println(" " + b);
		for (int i = 0; i < t - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(" " + c);
		}
		System.out.println();
		System.out.println(t + "th value in series:" + c);
	}
}
