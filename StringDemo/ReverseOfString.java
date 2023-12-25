package StringDemo;

public class ReverseOfString {

	public static void main(String[] args) {
		String str = "Aravind";
		
		System.out.println(reverse2(str.toLowerCase()));
	}

	public static String reverse1(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("reversed value :" + rev);
		return rev;
	}
	
	public static String reverse2(String str) {
		StringBuilder sam = new StringBuilder(str);
		sam = sam.reverse();
		
		return sam.toString();
	}
	
}
