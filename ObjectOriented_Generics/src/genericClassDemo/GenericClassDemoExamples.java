package genericClassDemo;

public class GenericClassDemoExamples<T> {
	// A class that can refer to any type is known as a generic class
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

	public static void main(String[] args) {
		GenericClassDemoExamples<String> usingGen = new GenericClassDemoExamples<>();
		usingGen.add("sample1");
		usingGen.add("sample2");
		System.out.println(usingGen.get());
	}

}
