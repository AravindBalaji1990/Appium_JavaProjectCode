package multipleiheritancedemo;

public interface IRunInterface {
	
	public void arithmeticoperation();
	
	public String returnString();
	
	public static void addition(int a, int b) {
		int result = a+b;
		System.out.println("this is addition :" +result);
	}
	

}
