package sampleCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class sampleArrayLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		List<String> al2 = new LinkedList<String>();// creating linkedlist
		al2.add("James");// adding object in linkedlist
		al2.add("Serena");
		al2.add("James");
		al2.add("Junaid");
		al2.add("Ravi");
		System.out.println("------------------------------");
		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
//		al.addAll(al2); // adding both the list
//		System.out.println("add all the items from both list : "+ al);
		System.out.println("------------------------------");
		al.retainAll(al2);
		System.out.println(al);
		System.out.println("------------------------------");
		List<String> combine = new LinkedList<>(al);
		combine.addAll(al2);
		System.out.println("adding both the list :" + combine);
		System.out.println("------------------------------");
		List<String> intersection = new LinkedList<>(al);
		intersection.retainAll(al2);
		System.out.println("retain the common item from the list " +intersection);
		System.out.println("------------------------------");
		combine.removeAll(intersection);
		System.out.println("we removeall the item from the list  :" +combine);

	}

}
