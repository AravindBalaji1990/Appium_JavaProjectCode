package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 5, 7 };
		Integer[] b = { 8, 2, 7, 4 };
		
		List<Integer> l1 = new ArrayList<>(Arrays.asList(a));
		List<Integer> l2 = new ArrayList<>(Arrays.asList(b));
		l1.retainAll(l2);
		System.out.println(l1);
		
//		List winterFruits = new ArrayList<>();
//		winterFruits.add("Clementine");
//		winterFruits.add("Plums");
//		winterFruits.add("Dates");
//		winterFruits.add("Grapefruit");
//		winterFruits.add("Kiwi");
//
//		
//		List summerFruits = new ArrayList<>();
//		summerFruits.add("Mango");
//		summerFruits.add("Plums");
//		summerFruits.add("Watermelon");
//		summerFruits.add("Papaya");
//		summerFruits.add("Grapefruit");
//		
//		winterFruits.retainAll(summerFruits);
//		
//		System.out.println(winterFruits);
	}

}
