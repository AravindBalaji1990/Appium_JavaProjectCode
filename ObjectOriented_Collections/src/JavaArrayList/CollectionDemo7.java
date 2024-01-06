package JavaArrayList;

import java.util.ArrayList;

public class CollectionDemo7 {

	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("D");
		al2.add("A");
		
		al1.addAll(al2);
		System.out.println(al1);
	}
}
