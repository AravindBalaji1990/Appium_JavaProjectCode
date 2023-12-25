package Demo;

import java.util.Scanner;

public class sorting_withoutlibs {
	public static void main(String[] args) {
		int num, i, j, temp; // declaration
		// Scanner input = new Scanner(System.in); // user will provide the
		// input
		// System.out.println("Enter the number of integers to sort:");
		// num = input.nextInt();

		// int array[] = new int[num];
		int array[] = { 1, 2, 3, 4, 7, 5, 9 };
		//System.out.println("Enter " + num + " integers: ");
		num = array.length;
		for (i = 0; i < array.length; i++)
			// array[i] = input.nextInt();

			for (i = 0; i < (num - 1); i++) {
				for (j = 0; j < num - i - 1; j++) {
					if (array[j] > array[j + 1]) // Ascending order
					 // if (array[j] < array[j + 1]) // descending order
					{
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}

		System.out.println("Sorted list of integers:");

		for (i = 0; i < num; i++)
			System.out.println(array[i]);
	}

}
