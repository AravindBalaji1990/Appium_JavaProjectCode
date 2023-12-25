package ArrayDemo;

public class ArrayDemoSession2 {

	public static void main(String[] args) {
		// to check where my condition satisfies 3
		int[] array3 = { 1, 2, 3, 4, 5 };
			   //index { 0, 1, 2, 3, 4 }
		for (int i = 0; i < array3.length; i++) {
			// i == index of array
			// array3[i]  value of the array
			if (i == 3) {
				System.out.println("the position of the arrya " + i + " and the value of it  " + array3[i]);
			}
		}

	}

}
