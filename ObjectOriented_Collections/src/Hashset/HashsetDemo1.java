package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo1 {

	public static void main(String[] args) {
		// initialisation of has set
//		Set<String> s = new HashSet<>(); 
		HashSet<String> al = new HashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add(" ");
		al.add("Ajay");
		al.add("fita");
		al.add("abc");
		al.add(null);
		System.out.println("the size of the data : " + al.size());
		// for each loop - iterate over the set
		for (String obj : al) {
//			if(obj!=null && obj.equals("abc")) {
			System.out.println("The list in Hash set : " + obj);
//			}
		}
		// this cannot be done as the index identificaiton is not possible in Hashset
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println("the data from the :"+ al.get(i));
//		}
	}
}
