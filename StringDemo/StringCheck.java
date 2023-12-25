package StringDemo;

public class StringCheck {

	public static void main(String[] args) {
		String st1 = new String("this is ");
		String st2 = "selenium tutorial";
		st1 = "this is just a demo ";
		System.out.println(st1 + st2);
		System.out.println(st1.concat(st2));
		
		
		// convert any otem to string
		int data = 10;
		System.out.println(String.valueOf(data));
		
		
		// string builder 
		StringBuilder demo2= new StringBuilder("Hello");
		demo2=new StringBuilder("Bye");
		System.out.println(demo2.append(" thank you"));
		System.out.println(demo2.reverse());
	}

}
