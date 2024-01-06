package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo1 {
	public static void main(String[] args) {
//		List<String> listdata = new LinkedList<String>();
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(" ");
		al.add("xyz");
		System.out.println("to get the value depending on index:" + al.get(0));

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
