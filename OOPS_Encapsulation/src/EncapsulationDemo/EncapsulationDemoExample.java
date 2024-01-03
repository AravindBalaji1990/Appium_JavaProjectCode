package EncapsulationDemo;

public class EncapsulationDemoExample {

	public String empName;

	// the below method we call it as getter
	// which will return only the data variable
	public String getEmpName() {
		return empName;
	}

	// the below method we call it as setter
	// which will set the variable name to the variable
	public void setEmpName(String empName) {
		empName = empName + "@gmail.com";
		this.empName = empName;
	}

	public static void main(String[] args) {

		EncapsulationDemoExample obj = new EncapsulationDemoExample();
		obj.setEmpName("sample");
		System.out.println("the data to be retrieved : " + obj.getEmpName());
	}
}
