package ArrayDemo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayDemo arraydemo = new ArrayDemo();
		arraydemo.multiDimentionalArrayDemo();

	}

	public void initialiseArrayDemoFirst() {
		String[] stringarraydemo = { "sample", "webdriver", "selenium", "java" };

		System.out.println("the total items in the array : " + stringarraydemo.length);
		System.out.println("to get one item from array : " + stringarraydemo[2]);
		for (int i = 0; i < stringarraydemo.length; i++) {
			// if (stringarraydemo[i].contains("web")) {
			System.out.println("the items in the array : " + i + " - " + stringarraydemo[i]);
		}
		// }
	}

	public void initialiseArrayDemoSecond() {
		int[] integerarraydemo = new int[5];
		integerarraydemo[0] = 1;
		integerarraydemo[1] = 2;
		integerarraydemo[2] = 4;
		integerarraydemo[3] = 7;
		integerarraydemo[4] = 9;

		System.out.println("the total items in the array : " + integerarraydemo.length);
		System.out.println("to get one item from array : " + integerarraydemo[2]);

	}

	public void initialiseArrayDemoThird() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total size of array : ");
		int num = input.nextInt();
		int[] integerarraydemo = new int[num];
		for (int i = 0; i < integerarraydemo.length; i++) {
			System.out.println("Enter the data to be in the array for position : " + i);
			int setnumtoarray = input.nextInt();
			integerarraydemo[i] = setnumtoarray;
		}

		System.out.println("the items in array : " + integerarraydemo.length);
		for (int i = 0; i < integerarraydemo.length; i++) {
			System.out.println(integerarraydemo[i]);
		}

	}

	public void multiDimentionalArrayDemo() {
		String[][] stringmulti = { { "sample", "sample1" }, { "sample2", "sample3" }, { "sample4", "sample5" } };
		System.out.println("to get the output of the array : " + stringmulti[1][1]);
		for (int i = 0; i < stringmulti.length; i++) {

			for (int j = 0; j < stringmulti[i].length; j++) {
				System.out.println("the items in the array : "+ i +" / "+ j + " - " + stringmulti[i][j]);
			}
		}
	}
}
