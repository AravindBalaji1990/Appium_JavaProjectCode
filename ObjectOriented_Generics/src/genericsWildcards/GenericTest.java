package genericsWildcards;

import java.util.ArrayList;
import java.util.List;

import genericClassDemo.GenericClassDemoExamples;

public class GenericTest {
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String[] args) {
		List<genericWildCardsExamples> obj = new ArrayList<genericWildCardsExamples>();
		obj.add(new genericWildCardsExamples());
		
		drawShapes(obj);
	}

}
