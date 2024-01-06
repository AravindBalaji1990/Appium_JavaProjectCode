package ListDemo;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

public class ListDemoSession {

	public static void main(String[] args) {
		// ArrayList<Integer> liinteger = new ArrayList<>();
		List<String> li = new ArrayList<>();
		li.add("java");
		li.add("perl");
		li.add("python");
		li.add("ruby");
		for (int i = 0; i < li.size(); i++) {

			if (li.get(i).equals("python")) {
				System.out.println("the dat in the list : " + li.get(i));
				li.remove(li.get(i));
			}

		}

		System.out.println("after removing : " + li);

		ArrayList<String> listring = new ArrayList<>();
		listring.add("Go");
		listring.add("javascript");

		li.addAll(listring);

		System.out.println("after concatinating two lists :" + li);
		System.out.println("-----------------------------------");

//		for (String listdata : li) {
//			if(listdata.contains("ub"))
//			System.out.println("the dat using foreachloop :" + listdata);
//		}

	}

}
