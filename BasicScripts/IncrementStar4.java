package BasicScripts;

public class IncrementStar4 {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 9; i++) {
			for (j = 9; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
