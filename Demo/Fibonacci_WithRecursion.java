package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci_WithRecursion {

	int fib(int n) {
		if (n == 1)
			return (1);
		else if (n == 2)
			return (1);
		else
			return (fib(n - 1) + fib(n - 2));
	}

	public static void main(String args[]) throws IOException {
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		System.out.println("enter last number");
		int n = Integer.parseInt(br.readLine());
		Fibonacci_WithRecursion ob = new Fibonacci_WithRecursion();
		System.out.println("fibonacci series is as follows");
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res = ob.fib(i);
			System.out.println(" " + res);
		}
		System.out.println();
		System.out.println(n + "th value of the series is " + res);
	}
}
