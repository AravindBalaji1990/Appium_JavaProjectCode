package sampleCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemoException1 {

	public static void main(String[] args) {
		List<String> datastringlist = new LinkedList<String>();
//		LinkedList<String> datastringlist1 = new LinkedList<String>();
		
		datastringlist.add("java");
		datastringlist.add("java");
		datastringlist.add("javscript");
		datastringlist.add("c#");
		datastringlist.add("python");
		datastringlist.add(null);
		
		System.out.println("the total items in the linkedlist :" +datastringlist.size());
		
		for (int i =0 ; i <datastringlist.size(); ++i) {
			System.out.println("the item in the list : " + datastringlist.get(i));
		}
		
	}

}
