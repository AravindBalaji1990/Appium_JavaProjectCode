package enumdemo;

enum DaysDemo {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumDemoSession2 {
	DaysDemo daysdemo;

	public EnumDemoSession2(DaysDemo daysdemo) {
		this.daysdemo = daysdemo;
	}

	public void dayIsLike() {
		switch (daysdemo) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		String str = "MONDAY";
		EnumDemoSession2 t1 = new EnumDemoSession2(DaysDemo.valueOf(str));
		t1.dayIsLike();
	}

}
