package StringFunctions;

public class RemoveNonAscii {

	public static void main(String[] args) {
		String str = "Bj��rk����oacute�";
        System.out.println("Before filtering : " +str);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println("After removing non ASCII chars:" +str);
	}

}
