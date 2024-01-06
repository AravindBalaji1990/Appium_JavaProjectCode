package overriding_demo;

public class TestClassChild extends TestClassParent {

	//runtime polymorphism
	public void arithmeticOperation() {
		int a = 6;
		int b = 7;
		int result = a * b;
		System.out.println("the child class with multiply : " + result);
	}

	public void demoD() {
		System.out.println("this is only in child");
	}

	public static void main(String[] args) {
//		TestClassParent objparent = new TestClassParent();
//		objparent.arithmeticOperation();// addition

		// the reference class will be the child class
		// we are just overwriting the logic of the parent
		TestClassParent obj = new TestClassChild();
		obj.arithmeticOperation(); // multiplication
		

		// this is an object exclusively
		// created for the child
		TestClassChild objj = new TestClassChild();
		objj.demoD();
	}

}
