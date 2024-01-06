package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationsTwoList {
	public static <T> Set<List<T>> getCombinations(List<List<T>> lists) {
		Set<List<T>> combinations = new HashSet<List<T>>();
		Set<List<T>> newCombinations;

		int index = 0;

		// extract each of the integers in the first list
		// and add each to ints as a new list
		for (T i : lists.get(0)) {
			List<T> newList = new ArrayList<T>();
			newList.add(i);
			combinations.add(newList);
		}
		index++;
		while (index < lists.size()) {
			List<T> nextList = lists.get(index);
			newCombinations = new HashSet<List<T>>();
			for (List<T> first : combinations) {
				for (T second : nextList) {
					List<T> newList = new ArrayList<T>();
					newList.addAll(first);
					newList.add(second);
					newCombinations.add(newList);
				}
			}
			combinations = newCombinations;

			index++;
		}

		return combinations;
	}
	
	public static void main(String[] args) {
	    List<Integer> l1 = Arrays.asList(1,2,3);
	    List<Integer> l2 = Arrays.asList(4,5);
	    List<Integer> l3 = Arrays.asList(6,7);

	    List<List<Integer>> lists = new ArrayList<List<Integer>>();
	    lists.add(l1);
	    lists.add(l2);
	    lists.add(l3);

	    Set<List<Integer>> combs = getCombinations(lists);
	    for(List<Integer> list : combs) {
	        System.out.println(list.toString());
	    }
	}

}
