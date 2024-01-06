package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo5 {
	int A ;
	String Name;
	public CollectionDemo5(int a , String  name){
		this.A =a;
		this.Name =name;
	}
	
	public static void main(String[] args) {
		CollectionDemo5 obj1 = new CollectionDemo5(1, "sample");
		CollectionDemo5 obj2 = new CollectionDemo5(2, "sample1");
		ArrayList<CollectionDemo5> li = new ArrayList<CollectionDemo5>();
		li.add(obj1);
		li.add(obj2);
		Iterator<CollectionDemo5> itr = li.iterator();// getting Iterator from arraylist
												// to
		// traverse elements
		while (itr.hasNext()) {
			System.out.println("values available in list :" + itr.next());
		}
		
		// for(CollectionDemo5 sa : li){
		//
		// System.out.println("values available in list :" + sa.A);
		// }
	}
}
