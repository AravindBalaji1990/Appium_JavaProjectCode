package Examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListtoArray {

	public static void main(String[] args) {
		List<String> teststring = new LinkedList<String>();
		teststring.add("a");
		teststring.add("b");
		teststring.add("c");
		teststring.add("d");
		System.out.println("items in the list : " +teststring);
		String[] strings = teststring.stream().toArray(String[]::new);
		for (int i = 0; i < strings.length; i++) {
			System.out.println("iteration values : " + strings[i]);
		}
	}

}
