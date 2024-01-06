package sampleCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDemoExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//intialisation
		ArrayList<String> datastring2 = new ArrayList<String>();
		List<String> datastring = new ArrayList<String>();
		datastring.add("javascript"); //0
		datastring.add("java"); //1
		datastring.add("c#"); //2
		datastring.add("python"); //3
		datastring.add("python"); //4
		datastring.add(null); //4
		
		// total items inside thelist 
		System.out.println("total items from the list : " + datastring.size());
		
		// to get the specific item from the list
		System.out.println("the item from the list : " + datastring.get(1));
		
		
		// use random in collecitons
		Random randomnumber = new Random();
		int num =	randomnumber.nextInt(datastring.size());
//		System.out.println("to pick random items from the collection : " 
//		+datastring.get(new Random().nextInt(datastring.size())));
		System.out.println("to pick random items from the collection : " 
				+datastring.get(num));
		
//		for (int i = 0; i < datastring.size(); i++) {
//			if(datastring.get(i).equals("c#")) {
//				datastring.remove(datastring.get(i)); // remove the item from the list
//			}
//		}
		
		
		for (String data : datastring) {
			
			System.out.println("items inside the array foreach : " + data);
		}
		
	}

}
