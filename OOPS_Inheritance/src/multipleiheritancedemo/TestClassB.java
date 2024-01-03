package multipleiheritancedemo;

public class TestClassB extends CommonParent implements ISampleInterface, IRunInterface {

	@Override
	public void methodDemo() {
		System.out.println("this is implementation of method demo from classB");
	}

	@Override
	public int methodDiplay() {
		System.out.println("this is implementation of method display from classB");
		return 45;
	}

	public static void main(String[] args) {
		TestClassB testclassb = new TestClassB();
		testclassb.methodDemo();
		System.out.println(testclassb.methodDiplay());
		testclassb.arithmeticoperation();
		System.out.println(testclassb.returnString());
		//why addition method - means with implementaiton is not accessible in the class
//		testclassb.addition(1,2);
		testclassb.additionOperation(1,3);
	}

	

	@Override
	public void arithmeticoperation() {
		System.out.println("this is arithmetic operation");
	}

	@Override
	public String returnString() {
		return "sample";
	}

}
