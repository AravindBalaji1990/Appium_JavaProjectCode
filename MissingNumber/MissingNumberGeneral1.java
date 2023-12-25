package MissingNumber;

import java.util.Arrays;

public class MissingNumberGeneral1 {

	public static void main(String[] args) {
		int[] test = {  10, 12, 13, 14, 2, 3, 4, 5, 6, 7, 8, 9 };

		 Arrays.sort(test);
		/* get the missing integer */

		int max = test[test.length - 1];
		int min = test[0];
		int sum = Arrays.stream(test).sum();
		int actual = (((max * (max + 1)) / 2) - min + 1);
		// Find:

		// the missing value
		System.out.println(actual - sum);
		// the slot
		System.out.println(actual - sum - min);

	}

}
