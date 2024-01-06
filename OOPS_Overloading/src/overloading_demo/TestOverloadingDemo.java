package overloading_demo;

public class TestOverloadingDemo {

	//compile time polymorphism
	// no paramter
	public void demo() {
		System.out.println("this is a method with no parameter");
	}

	
	public void demo(int a, int b) {
		int result = a + b;
		System.out.println("addition of two parameter : " + result);
	}

	public int demo(int x, int y, int z) {
		int result = x + y + z;
		return result;
	}

	public void demo(String name, int number) {
		System.out.println("the data for string and number : " + name + " - " + number);
	}
	
	private void demo(String name, int number, boolean data) {
		System.out.println("the parameters : " + name + " - " +number + " - "+ data);
	}

	public static void main(String[] args) {
		TestOverloadingDemo testoverlaodingdemo = new TestOverloadingDemo();
		testoverlaodingdemo.demo("sample", 100);;
		testoverlaodingdemo.demo(5, 6);
		testoverlaodingdemo.demo("from private", 10, false);
		System.out.println(testoverlaodingdemo.demo(5, 6, 7));
		testoverlaodingdemo.demo("sample", 123234);

	}

}
