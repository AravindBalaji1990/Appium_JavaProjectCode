package Demo;

public class array_Demo_2dimentional {

	public static void main(String[] args) {
		int[][] arrayinteger = { { 1, 2 }, { 3, 9 }, { 5, 6 } };
		for (int i = 0; i < arrayinteger.length; i++) {
			for (int j = 0; j < arrayinteger.length - 1; j++) {
				System.out.println("the array in the position " + i + "," + j + " : " + arrayinteger[i][j]);

			}

		}
	}

}
