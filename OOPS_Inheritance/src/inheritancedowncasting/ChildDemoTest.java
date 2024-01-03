package inheritancedowncasting;

public class ChildDemoTest extends ParentDemoTest {

	public static void testDisplay(ParentDemoTest objParent) {
		// casting to super
		ChildDemoTest objChild = (ChildDemoTest) objParent;
		System.out.println("downcasting achieved");
	}

	public static void main(String[] args) {
		ParentDemoTest obj = new ChildDemoTest();
		ChildDemoTest.testDisplay(obj);
	}

}
