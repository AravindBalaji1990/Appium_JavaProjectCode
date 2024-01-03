package interfacedemo;

public class TestClassA extends TestClassC implements TestInterface1, TestInterface2 {

	public static void main(String[] args) {
		TestClassA testclassa = new TestClassA();
		testclassa.testMethod1();
		System.out.println(testclassa.testMethod3());
		testclassa.testMethod2();
		testclassa.methodAddition();
		
		System.out.println(testclassa.print("hi I am from classc"));
		
		TestClassB testclassb = new TestClassB();
		testclassb.testMethod1();
		System.out.println(testclassb.testMethod3());
		testclassb.testMethod2();
	}

	@Override
	public void testMethod1() {
		int result = 2 * 2;
		System.out.println("the result of multiplicaiton :" + result);
	}

	@Override
	public int testMethod3() {
		return 200;
	}

	@Override
	public void methodAddition() {
		System.out.println("Adding method in TestClassA");
	}

}
