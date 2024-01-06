package Examples;

public class ExampleInstanceof {

	public static void main(String[] args) {
		ExampleInstanceof obj = null;
		System.out.println(obj instanceof ExampleInstanceof);
		
		ExampleInstanceof obj1 = new ExampleInstanceof();
		System.out.println(obj1 instanceof ExampleInstanceof);
	}

}
