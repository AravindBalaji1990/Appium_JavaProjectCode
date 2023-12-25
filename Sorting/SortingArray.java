package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		Arrays.sort(array);
		System.out.println("sorted ascending : " +array);
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   
		
		System.out.println("--------");
		Collections.sort(Arrays.asList(array), Collections.reverseOrder());
		
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}    
	}

}
