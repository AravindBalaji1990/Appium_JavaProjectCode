package Demo;

import java.util.ArrayList;

public class array_Demo_repititive {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		int[] array = { 1, 2, 2, 3, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[i + 1]) {
				System.out.println("repeated arrya :" + array[i]);
			}else {
			li.add(array[i]);
			System.out.println(li);
			}
		}

	}

}
