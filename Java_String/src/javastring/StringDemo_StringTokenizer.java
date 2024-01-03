package javastring;

import java.util.StringTokenizer;

public class StringDemo_StringTokenizer {

	public static void main(String[] args) {
		String str = "This is a , string object";
		// default delimiter will be spaces
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
//		System.out.println("----------------------------------");
//		String str1 = "This is a *string object";
//		StringTokenizer st1 = new StringTokenizer(str1, "*");
//		while (st1.hasMoreTokens()) {
//			System.out.println(st1.nextToken());
//		}

	}

}
