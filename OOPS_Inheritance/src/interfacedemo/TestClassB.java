package interfacedemo;

public class TestClassB implements TestInterface1 {

	@Override
	public void testMethod1() {
		System.out.println("this is from TEst Class B");
	}

	@Override
	public int testMethod3() {
		System.out.println("this is from TEst Class B with int");
		return 100;
	}

	
	

}
