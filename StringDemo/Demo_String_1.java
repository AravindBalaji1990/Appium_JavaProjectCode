package StringDemo;

public class Demo_String_1 {

	public static void main(String[] args) {
		StringBuilder demo2 = new StringBuilder("Hello");
		System.out.println("this is for string builder : " +demo2);
		// The above object too is stored in the heap and its value can be modified
		demo2 = new StringBuilder("Bye");
		// Above statement is right as it modifies the value which is allowed in the
		// StringBuilder
		
		System.out.println("this is for string builder : " +demo2);
		
		StringBuffer demo1 = new StringBuffer("Hello") ;
		System.out.println(demo1);
		// The above object stored in heap and its value can be changed .
		demo1=new StringBuffer("Bye");
		// Above statement is right as it modifies the value which is allowed in the StringBuffer
		System.out.println("this is for string buffer : " +demo1);
	}

}
