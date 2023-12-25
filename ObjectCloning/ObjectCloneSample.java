package ObjectCloning;

public class ObjectCloneSample implements Cloneable {
	int rollno;
	String name;

	ObjectCloneSample(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			ObjectCloneSample s1 = new ObjectCloneSample(101, "amit");
			ObjectCloneSample s2 = (ObjectCloneSample) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}

}
