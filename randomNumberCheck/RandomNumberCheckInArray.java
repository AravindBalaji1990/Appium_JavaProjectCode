package randomNumberCheck;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberCheckInArray {

	public static void main(String[] args) {
		Random randomCheck = new Random();
		int num = randomCheck.nextInt(30);
		System.out.println("the random number generated : " +num);
		String [] datesallowed = {"5","10","25"};
		if(Arrays.asList(datesallowed).contains(String.valueOf(num))) {
			System.out.println("the random number is in the array");
		}else {
			System.out.println("the random number is not in the array");
		}
	}

}
