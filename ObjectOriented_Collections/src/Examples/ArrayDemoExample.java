package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDemoExample {

	public static void main(String[] args) {
		int[] sample = { 2, 5, 1, 9, 3, 1 };
		System.out.println("Before : " + sample[0]);
		Arrays.sort(sample);
		System.out.println("After : " + sample[0]);

		List<Integer> intsam = new ArrayList<>();
		intsam.add(1);
		intsam.add(2);
		intsam.add(1);
		intsam.add(5);
		intsam.add(5);
		List<Integer> result = intsam.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println(findDuplicates(intsam));
	}

	public static Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {
		final Set<Integer> setToReturn = new HashSet<>();
		final Set<Integer> set1 = new HashSet<>();

		for (Integer yourInt : listContainingDuplicates) {
			if (!set1.add(yourInt)) {
				setToReturn.add(yourInt);
			}
		}
		return setToReturn;
	}

}
