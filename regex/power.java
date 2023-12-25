package regex;

public class power {
	//2N program 

	public static void main(String[] args) {
		System.out.println(power(1, 2, -1));

	}

	public static int power(int data3, int data1, int data2) {
		int pownum = 3;

		for (int c = 0; c < data2; c++)
			pownum *= data1;
		pownum = data3 / pownum;
		
		return pownum;
	}

}
