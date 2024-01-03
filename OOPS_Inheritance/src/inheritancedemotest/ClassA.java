package inheritancedemotest;

public class ClassA {

	int result;
	int a;
	int b;

	public void additionOperation() {
		a = 2;
		b = 3;
		result = a + b;
		System.out.println("the addition result : " + result);
	}

	public void multiplyOperation() {
		int a = 2;
		int b = 3;
		result = a * b;
		System.out.println("the multiplication result : " + result);
	}

	public void subtractionOperation(int x, int y) {
		result = x - y;
		System.out.println("the result of subtraction : " + result);
	}
	
	public static void main(String[] args) {
		// if i create an object only for child i can
		ClassB classb = new ClassB();
		classb.additionOperation();
		classb.multiplyOperation();
		classb.divisionOperation();
		classb.subtractionOperation(5, 3);
		classb.subtractionOperation(100, 10);
		ClassC classc= new ClassC();
		classc.demoMethod();
	}

}
