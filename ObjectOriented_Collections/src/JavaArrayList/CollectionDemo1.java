package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {
//		 List<String> lial = new ArrayList<>();
		ArrayList<String> al = new ArrayList<String>();// creating arraylist
		al.add("English");// adding object in arraylist
		al.add("French");
		al.add("German");
		al.add("Spanish");
		al.add("English");
		al.add("");
		al.add("Hindi");
		al.add("marathi");
		al.add("chinese");
		al.add("Abc");

		Iterator<String> itr = al.iterator();// getting Iterator from arraylist
		System.out.println(itr);
		// traverse elements

		while (itr.hasNext()) {

			System.out.println("values available in list :" + itr.next());
		}
	}
}
