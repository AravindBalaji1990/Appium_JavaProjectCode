package enumdemo;

public class EnumDemoSession {
	enum ColorsDemo {
		RED, GREEN, BLUE;
	}

	public static void main(String[] args) {
		ColorsDemo cd = ColorsDemo.GREEN;
		System.out.println(cd);
	}

}
