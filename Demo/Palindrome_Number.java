package Demo;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// int original,reverse;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		// System.out.println("Scanner in : " + in);
		int num = in.nextInt();
		// int num=676;
		System.out.println("int num : " + num);
		int n = num;
		// reverse operation
		int rev = 0, rmd;
		while (num > 0) {
			rmd = num % 10;
			rev = rev * 10 + rmd;
			num = num / 10;
		}
		if (rev == n)
			System.out.println(n + " is a Palindrome Number!");
		else
			System.out.println(n + " is not a Palindrome Number!");
	}

}
