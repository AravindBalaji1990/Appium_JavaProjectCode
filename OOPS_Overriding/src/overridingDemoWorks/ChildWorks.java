package overridingDemoWorks;

public class ChildWorks extends ParentWorks {
	// Child Class

	// It has the same method name as the parent
	// But the logic we give for parent and child are different
	// multiply method
	public void sample(int a, int b) {
		// int a = 2;
		// int b = 3;
		int result = a * b;
		System.out.println("the multiply result : " + result);
	}

	public void demoPrint() {
		System.out.println("demo print method");
	}

	public static void main(String[] args) {
		// when i call the methods via object
		ParentWorks obj = new ParentWorks();
		obj.sample(3, 4); // 7
		// the method that we are calling is from parent but the logic needs to
		// be implemented from child
		ParentWorks obj_1 = new ChildWorks();
		obj_1.sample(5, 6);
		
		
		ChildWorks childwork = new ChildWorks();
		childwork.demoPrint();
	}
}
