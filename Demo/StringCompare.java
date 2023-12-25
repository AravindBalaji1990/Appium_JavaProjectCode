package Demo;

public class StringCompare {

	public static void main(String[] args) {

		String s1="abc";
		String s2= "ABC";
		
		if (s1==s2){
			System.out.println("is equals");
		}
		else if(s1.equalsIgnoreCase(s2)){
			System.out.println("is equals equalignore");
		}
		
		else{
			System.out.println("no o/p");
		}
	}

}
