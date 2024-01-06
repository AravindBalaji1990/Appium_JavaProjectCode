package Examples;

import java.util.LinkedList;
import java.util.List;

public class AddTwoLists {

	public static void main(String[] args) {
		List<String> lis = new LinkedList<>();
		lis.add("ab");
		lis.add("cd");
		lis.add("ef");
		List<String> lis1 = new LinkedList<>();
		lis.add("qw");
		lis.add("er");
		lis.add("ty");
		lis.add("ab");
//		System.out.println(lis.retainAll(lis1));
//		System.out.println(lis1);
		lis.addAll(lis1);
		
		System.out.println(lis);

	}

}
