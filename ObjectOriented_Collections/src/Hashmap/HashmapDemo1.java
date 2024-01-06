package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo1 {

	public static void main(String[] args) {
		// initialisation of map
//		 Map<Integer, String> hm1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// put is a keyword similar to add
		// put = adding items to list
		// hm.put(key, value);
		hm.put(100, "sam");
		hm.put(103, "thomas");
		hm.put(101, "Thomas");
		hm.put(102, "Aish");
		hm.put(103, "Thomas");
		hm.put(null, "dan");
		hm.put(null, "daniel");
		hm.put(104, "samson");
		hm.put(105, null);
		hm.put(106, null);
		// hm.put(null, null);
		// map.Entry and entryset will set the key to value
		for (Map.Entry data : hm.entrySet()) {
			System.out.println("the entire data : " + data.getKey() + " , " + data.getValue());
			System.out.println("the key value only : " + data.getKey());
			System.out.println("the value only : " + data.getValue());
		}
	}

}
