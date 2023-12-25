package StringDemo;

import java.util.StringTokenizer;


public class Demo_String_2 {

	public static void main(String[] args) {
//		StringBuffer strb = new StringBuffer("This is ");
//		strb.append(" a new string object");
//		//System.out.println(strb.toString());

		String str = "This is a, string object";
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
