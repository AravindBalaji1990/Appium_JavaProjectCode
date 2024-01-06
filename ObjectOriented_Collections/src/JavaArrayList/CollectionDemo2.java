package JavaArrayList;

import java.util.ArrayList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// Declaration of array list
		// List<String> data = new ArrayList<>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("French");
		al.add("English");
		al.add("German");
		al.add(" ");
		al.add("Spanish");
		al.add("French");
		al.add("telugu");
		al.add(null);
		System.out.println("with out loop :" + al);

		al.remove(0);
		System.out.println("to get the size of the list :" + al.size());
		System.out.println("with out loop :" + al);
		System.out.println("to fetch the first item from list :" + al.get(6));
		// manipulate the data using foreach loop
		for (String individualitem : al) {
//			if(individualitem !=null && !individualitem.equals(" ") 
//					&& individualitem.contains("ng")) {
			System.out.println("the items inside the list :" + individualitem);
//			}
		}
	}
}
