package multipleiheritancedemo;

public class TestClassC extends CommonParent implements IRunInterface  {

	public static void main(String[] args) {
		TestClassC testclassc = new TestClassC();
		testclassc.arithmeticoperation();
		System.out.println(testclassc.returnString());
		//addition(1,2);
		TestClassC testclassc2 = new TestClassC();
		testclassc2.additionOperation(2, 3);
	}

	@Override
	public void arithmeticoperation() {
		int a = 2;
		int b = 3;
		int result = a + b;
		System.out.println("the reuslt of arithmetic operation : " + result);
	}

	@Override
	public String returnString() {
		return "this is from TestClass C";
	}

}
