package encapsulationdemo1;

public class TestDemoEncapsulation1 {
	int num;

	// Getter method -> it will return the value of the variable
	public int getNum() {
		return num;
	}

	// Setter method -> it will assign the value of the variable
	public void setNum(int num) {
		this.num = num * 2;
	}

	public static void main(String[] args) {
		TestDemoEncapsulation1 testdemoencapsulation1 = new TestDemoEncapsulation1();
		testdemoencapsulation1.setNum(100);
//		System.out.println("the assigned value " + testdemoencapsulation1.getNum());
		int result = 100 + testdemoencapsulation1.getNum();
		System.out.println("output of the operation :" + result);
	}

}
