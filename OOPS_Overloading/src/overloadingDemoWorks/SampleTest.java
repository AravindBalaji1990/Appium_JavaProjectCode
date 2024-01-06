package overloadingDemoWorks;

public class SampleTest {

	// Overloading
	// same method name and different parameter/argument(data type of it)
	public void method() {
		System.out.println("this is method with no arguments");
	}

	private void method(int x, String y) {
		System.out.println("this is method with no arguments");
	}

	void method(int a, int b) {
		int result = a + b;
		System.out.println("the addition result :" + result);
	}

	void method(double e, int f) {
		double result = e + f;
		System.out.println("the addition result :" + result);
	}

	// the below method is not possible as it has the same data-type as the
	// other method
	void method(int x, int y, double d) {
		int result = x + y;
		System.out.println("the addition result :" + result);
	}

	void method(int a, int b, String data) {
		int result = a * b;
		System.out.println(data + ", " + result);
	}

	public String method(String name) {
		return name;
	}
}
