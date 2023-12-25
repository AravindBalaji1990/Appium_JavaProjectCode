package MissingNumber;

public class OddMissing {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result;
		int[] oddnum = { 1, 3, 5, 7, 11, 15};
		for (int i = 0; i < oddnum.length - 1; i++) {

			num1 = oddnum[i];
			num2 = oddnum[i + 1];

			if (num1 > num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}

			if (result != 2) {
				for (int j = oddnum[i]; j < oddnum[i + 1]; j++) {
					if (j % 3 == 0)
						System.out.print("the missing number : " + j);
				}

			} else {
				System.out.println("not the missing number");

			}

		}
	}
}
