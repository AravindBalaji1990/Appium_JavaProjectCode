package javastring;

public class StringDemo {

	public static void main(String[] args) {
//		String name = "Aravind";
//		name = name + "Balaji";
//		System.out.println(name);
//
//		String test = name.concat("shiva");
//		System.out.println("concatenate the string: "+test);
//		System.out.println("----------------------------");

//		StringBuffer sb = new StringBuffer("Hello");
//		System.out.println("String buffer example : "+sb);
//
//		sb = new StringBuffer("Hello Aravind");
//		System.out.println(sb);
//		
//		sb.append(" how are you");
//		System.out.println(sb);
//
//		System.out.println("capacity :" + sb.capacity());
//		System.out.println("reverse : " + sb.reverse());
//		System.out.println("insert : " + sb.insert(0, "balaji"));
//		System.out.println("----------------------------");
		StringBuilder sbuilder = new StringBuilder("hi");
		System.out.println(sbuilder);
		sbuilder = new StringBuilder("hi aravind");
		System.out.println(sbuilder);
		System.out.println(sbuilder.deleteCharAt(3));
		System.out.println(sbuilder.chars());
		System.out.println(sbuilder.append(" test"));
	}

}
