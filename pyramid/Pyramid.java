package pyramid;

public class Pyramid {

	public static void main(String[] args) {
		int n =5;
		int st = 1; // number of stars
		int sp = n - 1; // number of spaces

		// 1st for loop for rows
		for (int i = 0; i < n; i++) {

			// 2nd for loop for printing spaces
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			// 3rd for loop for printing stars
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			st += 2;
			sp--;
			System.out.println();
		}
	}

}
