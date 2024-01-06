package Linkedlist;

import java.util.LinkedList;

public class LinkedlistDemo2 {
	public static void main(String[] args) {
		// List<String> alist = new LinkedList<String>();
		// declaration of linked list
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(" ");
		al.add("Ajay");
		al.add(null);
		for (String al_individualitem : al) {
			System.out.println("data inside the list : " + al_individualitem);
		}
	}
}
