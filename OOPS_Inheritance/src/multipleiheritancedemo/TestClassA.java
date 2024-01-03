package multipleiheritancedemo;

public class TestClassA extends CommonParent implements ISampleInterface , ISampleDemo{

	public void methodDemo() {
		System.out.println("this is from testclassA");
	}

	public int methodDiplay() {
		return 0;
	}

	public static void main(String[] args) {
		TestClassA testclassa = new TestClassA();
		testclassa.methodDemo();
		testclassa.additionOperation(4, 5);
		TestClassB testclassb = new TestClassB();
		testclassb.methodDemo();
	}

	@Override
	public void Demo() {
		// TODO Auto-generated method stub
		
	}

}
