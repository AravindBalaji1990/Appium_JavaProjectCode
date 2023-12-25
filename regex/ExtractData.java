package regex;

public class ExtractData {

	public static void main(String[] args) {
		// remove special characters
		String str = "This#string%contains^special*characters&.";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);
		
		//Get special characters
		System.out.println("wejri+234-wer*324sdf/".replaceAll("\\w+",""));
	}

}
