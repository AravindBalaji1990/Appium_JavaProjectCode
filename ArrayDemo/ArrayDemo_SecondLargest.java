package ArrayDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo_SecondLargest{

	public static void main(String[] args) {

		// find the second largest item in the array
		Integer[] datainteger = { 1, 2, 9, 6, 5, 7 };
		System.out.println(getSecondLargest1(datainteger, datainteger.length));

	}

	// method with parameter and a return type
	public static int getSecondLargest1(Integer[] datainteger, int total) {
		Arrays.sort(datainteger);// i sort  the items in the array
		for (int i = 0; i < datainteger.length; i++) {
			System.out.println("after sorting : " +datainteger[i]);
		}
		return datainteger[total - 2];
	}
	
	
	public static int getSecondLargest2(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(total-2);  
		return element;  
		}  
}
