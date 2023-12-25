package StringFunctions;

public class StringSampleExamples {

	public static void main(String[] args) {
		String str1= new String("A string");
//		System.out.println(str);
		String str2 = " and another string";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		StringBuffer strb = new StringBuffer("This is "); 
		strb.append(" a new string object"); 
		System.out.println(strb.toString());
		
		
		StringBuffer strb1 = new StringBuffer("AravindBalaji"); 

		System.out.println(strb1.substring(5, 11));
		
		
		
	}

}
