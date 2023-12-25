package Demo;

import java.util.Arrays;
import java.util.Collection;

public class array_match {
	public static void main(String args[]) throws Exception {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		// built in library function in java
		Arrays.sort(array);
		printArray("Sorted array", array);
		// searching on whihc place the variable 2 occurs
		int index = Arrays.binarySearch(array, 2);
		System.out.println("Found 2 @ " + index);
	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
