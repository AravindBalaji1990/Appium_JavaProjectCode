package HashTable;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// it doesnt accept null key or null values
		// it doesnt maintain the insertion order
		// it contains unique elements

//		Dictionary<Integer, String> hm = new Hashtable<Integer, String>();
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		hm.put(104, "Rahul");
//		 hm.put(102, null);
		 hm.put(null, "dan");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
