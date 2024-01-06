package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class CollectionDemo3 {

	public static void main(String[] args) {
		// Creating user-defined class objects
		Student s1 = new Student(123, "abc", 23);
		Student s2 = new Student(124, "efg", 21);
		Student s3 = new Student(125, "hij", 25);

		ArrayList<Student> al = new ArrayList<Student>();// creating arraylist
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);

		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
