package inheritancedemotest;

public class SampleChildClassDemo extends SampleParentClassDemo {
	String name = "child class variable";

	public void displayMethod() {
		System.out.println("displays method from child");
	}

	// super keyword which will always pull from parent
	public void demoMethod() {
		super.displayMethod();
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		SampleChildClassDemo obj = new SampleChildClassDemo();
		obj.displayMethod();
		obj.demoMethod();
	}

}
