package Examples;

import java.util.Hashtable;
import java.util.Set;
import java.util.StringTokenizer;

public class ExamplesCollection_Hashtable {
	// scenario: To eradicate the duplicate entry from a hashtable

	public static void main(String[] args) {
		Hashtable<Empl, String> tm = new Hashtable<Empl, String>();
		tm.put(new Empl(134, "Ram", 3000), "RAM");
		tm.put(new Empl(235, "John", 6000), "JOHN");
		tm.put(new Empl(876, "Crish", 2000), "CRISH");
		tm.put(new Empl(512, "Tom", 2400), "TOM");
		System.out.println("Adding duplicate entry:");
		tm.put(new Empl(512, "Tom", 2400), "TOM");
		System.out.println("Hashtable entries:");
		// it only takes up the unique values
		Set<Empl> keys = tm.keySet();
		for (Empl key : keys) {
			System.out.println(key + " ==> " + tm.get(key));
		}
		System.out.println("Duplicate got eliminated!!!");
	}
}

class Empl {

	private String name;
	private int salary;
	private int id;

	// Constructor 
	public Empl(int id, String n, int s) {
		this.id = id;
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public String MethodToCall() { return "Id: " + this.id + " -- Name: " +
	 * this.name + " -- Salary: " + this.salary; }
	 */

	public int hashCode() {
		System.out.println("Inside hashcode ---- " +this.getId());
		return this.getId();
	}

	public boolean equals(Object obj) {
		// Initialisation
		// and creating an object for the entire class
		Empl e = null;
		if (obj instanceof Empl) {
			// casting
			e = (Empl) obj;
		}
		System.out.println("Check the id is equals");
		if (this.getId() == e.getId()) {
			return true;
		} else {
			return false;
		}

	}
}