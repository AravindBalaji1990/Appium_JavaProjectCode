package Demo;

public class Reverse_String {

	public static void main(String[] args) {
		// input - sample
		// output - elpmas

		String input = "sample";
		char[] temparray = input.toCharArray(); //{s,a,m,p,l,e}
		
		int left, right = 0;
		right = temparray.length - 1;
		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];// fromt he left to a temp variable
			temparray[left] = temparray[right]; //shift the right to left
			temparray[right] = temp; //whet ever intemp goes to right
		}
		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}

}
