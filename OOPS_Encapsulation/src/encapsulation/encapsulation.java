package encapsulation;

public class encapsulation {
	// Encapsulation means hiding ur data
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary+12;
	}

	public static void main(String args[]) {
		// I create a object for the encapsulation
	encapsulation obj_encapsulation = new encapsulation();
	// setting the data
	obj_encapsulation.setSalary(100000);
	// retrieve the data
	System.out.println("This salary we got : " +obj_encapsulation.getSalary());
	}

}