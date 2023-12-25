package StringFunctions;

import java.util.StringTokenizer;

public class RemoveMultipleSpaces {

	public static void main(String[] args) {
		String str = "String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        System.out.println("Printing : " + sb);
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
            System.out.println("inside the while loop : " + sb);
        }
        System.out.println(sb.toString().trim());
    }
	}