package testmultilevelinheritance;

public class ClassB extends ClassA {

	// let this class be child class
	public void additionOperation() {
		int a = 2;
		int b = 3;
		// the result variable is used from parent class
		result = a + b;
		System.out.println("the result of addition :  " + result);
	}

	public static void main(String[] args) {
		ClassB classb = new ClassB();
		classb.additionOperation();
		classb.demoDisplay();
	}

}
