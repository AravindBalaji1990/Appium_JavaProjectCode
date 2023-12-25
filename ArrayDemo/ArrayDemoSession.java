package ArrayDemo;

public class ArrayDemoSession {

	public static void main(String[] args) {
		// Array mean group of similar datatypes
		// Array i salways indicated or referred by index values and it starts
		// with 0
		int[] array1 = new int[3];
		// 0,1,2 this is the format for index in above statement
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		System.out.println("the array at position 1 : " + array1[0]);

		String[] array2 = { "test1", "test2", "test3" };
		System.out.println("the array at position 2 :" + array2[1]);

		int[] array3 = { 1, 2, 3, 4, 5 };
		System.out.println("the array at position 2 :" + array3[1]);

		int[][] array2d = { { 1, 2, 3 }, { 5, 4, 6 }, { 3, 4, 78 }, { 1, 3, 67 } };

		System.out.println("the array at [][] :" + array2d[2][2]);

	}

}
