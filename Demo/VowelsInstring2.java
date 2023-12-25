package Demo;

public class VowelsInstring2 {

	public static void main(String[] args) {
		String str = "This is a test";
		str.toCharArray();
		if(str.contains("a")||str.contains("e")||str.contains("i")|| str.contains("o")|| str.contains("u")){
			System.out.println("vowels available");
		}else{
			System.out.println("Not available");
		}

	}
}
