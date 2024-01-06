package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo6 {

	public static void main(String[] args) {
		// define the collection called Arraylist
		//List<String> li = new ArrayList<>();
		ArrayList<String> listdata = new ArrayList<>();
		listdata.add("US");
		listdata.add("UK");
		listdata.add("China");
		listdata.add("US");
		listdata.add(" ");
		listdata.add(null);

		System.out.println("to print the value indipendently :" + listdata.get(2).length());
		// size() - will fetch the total data in the list
		// we cannot give length here but length will measure the total
		// characters in the string
		System.out.println("the total items in the list : " + listdata.size());
		for (int i = 0; i < listdata.size(); i++) {
			// if(listdata.get(i).equals("U") && !listdata.get(i).isEmpty()
			// &&listdata.get(i) != null && listdata.get(i).length() !=0)
			System.out.println("to get the individual data index value: " + i + " the data " + listdata.get(i));
		}

		// for each loop to manipulate the data back to display
		// for (String data : listdata) {
		// if (data.contains("U") && !data.isEmpty() && data != null
		// && data.length() != 0)
		// {
		// System.out.println("the data from list individually : " + data);
		// }

	}

}
