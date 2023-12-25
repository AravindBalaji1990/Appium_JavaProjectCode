package Demo;

import java.util.Arrays;
import java.util.Collections;

public class sorting_defaultlib {
	public static void main(String args[]) {
		String[] companies = { "Google", "Apple", "Sony" };

		// sorting java array in ascending order
		
		 System.out.println(
		 "Sorting String Array in Ascending order in Java Example");
		 System.out.println("Unsorted String Array in Java: ");
		 printNumbers(companies); 
		 Arrays.sort(companies);
		 ///Ascending using	 library functions 
		 System.out.println("Sorted String Array in ascending order : ");
		 printNumbers(companies);
		 

		// sorting java array in descending order
		System.out.println("Sorting Array in Descending order in Java Example");
		System.out.println("Unsorted int Array in Java: ");
		printNumbers(companies);
		Arrays.sort(companies, Collections.reverseOrder());
		System.out.println("Sorted int Array in descending order : ");
		printNumbers(companies);

	}

	public static void printNumbers(String[] companies) {
		for (String company : companies) {
			System.out.println(company);
		}
	}

}
