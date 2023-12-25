package ScannerDemo;

import java.util.Scanner;

public class ScannerDemoSession {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("the user inputs the integer : ");
		int num1 = input.nextInt();
		System.out.println("the user inputs the integer : ");
		int num2 = input.nextInt();
		int result = num1 + num2;
		System.out.println("the addition result : " + result);

		System.out.println("user inputs a string : ");
		String data = input.next();
		System.out.println("the user defined sttring : " + data);

	}

}
