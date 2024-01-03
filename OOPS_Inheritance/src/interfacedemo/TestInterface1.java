package interfacedemo;

public interface TestInterface1 {
	//interface can have only methods without implementation
	public void testMethod1();
	

	// default keyword - this will help us to create a method with implementation in
	// side a interface
	// this is available only after java 8
	default void testMethod2() {
		System.out.println("this is the default mehtos in interface");

	}

	public int testMethod3();
}
