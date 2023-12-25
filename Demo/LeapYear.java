package Demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year you want to check:- ");
		int year = s.nextInt();
		if (test(year)) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}

	public static boolean test(int year) {
		boolean is_divisible_by_4_and_not_by_100 = (year % 4 == 0 && year % 100 != 0);
		boolean divisible_by_400 = (year % 400 == 0);
		return (is_divisible_by_4_and_not_by_100 || divisible_by_400);
	}

}
