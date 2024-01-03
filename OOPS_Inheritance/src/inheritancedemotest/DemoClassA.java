package inheritancedemotest;

public class DemoClassA extends ClassA implements Itestinterface {

	public static void main(String[] args) {
		DemoClassA obj = new DemoClassA();
		obj.additionOperation();
		obj.subtractionOperation(10, 9);
		DemoClassB obj1 = new DemoClassB();
		obj1.additionOperation();
		obj1.multiply();

	}

	public void additionOperation() {
		int a = 2;
		int b = 3;
		int result = a + b;
		System.out.println("the result of addition : " + result);

	}

	public int subtractionOperation() {
		// TODO Auto-generated method stub
		return 0;
	}

}
