package inheritancedemo;

public class ChildClassDemo extends ParentClassDemo {
	// only in the child class
	public void methodSubtraciton() {
		int result = 100 - 1;
		System.out.println("the result of subtraction : " + result);
	}

	public static void main(String[] args) {
		ChildClassDemo childclassdemo = new ChildClassDemo();
		childclassdemo.methodSubtraciton();
		childclassdemo.methodMultiply(2, 3);
		System.out.println(childclassdemo.a);
	}

}
