package encapsulation;

public class EncapDemoSession {
	int salary =100;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name + "abc";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		salary = salary -1;
		this.salary = salary;
	}

	public static void main(String[] args){
		EncapDemoSession encapdemosession = new EncapDemoSession();
		encapdemosession.setSalary(100000);
		System.out.println("the salary : "+encapdemosession.getSalary());
		encapdemosession.setName("java");
		System.out.println("the name :" +encapdemosession.getName());
	}
}
