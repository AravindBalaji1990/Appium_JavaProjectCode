package superKeywordDemo;

public class ChildClassB extends ParentClassA {
	String name = "Sample child";

	public void arithmeticOperation() {
		int a = 2;
		int b = 3;
		int result = a * b;
		System.out.println("The multiply operation : " + result);
	}
	
	public void sampleCallingParent() {
		super.arithmeticOperation();
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		ChildClassB objchildclassb = new ChildClassB();
		objchildclassb.arithmeticOperation();
		objchildclassb.sampleCallingParent();
		
	}

}
