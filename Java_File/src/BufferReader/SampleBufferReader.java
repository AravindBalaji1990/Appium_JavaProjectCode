package BufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleBufferReader {
	public static void main(String a[]) {
		// this program we are trying to read a word within a line
		// since we are reading it as paragraph /line by line we are using a
		// BufferedReader
		BufferedReader br = null;
		String strLine = "";
		try {
			br = new BufferedReader(
					new FileReader("./DataTextFile/output3.txt"));
			// We are validation line by line
			while ((strLine = br.readLine()) != null) {
				// checking the specific word availability in each lines
				// substring is used to validated from the index values
				// main purpose of substring is used to validate a string with in a string
				// contains - checks for the respective word form the line
				boolean specificindex = strLine.substring(0, 15).contains("mac");
				String[] name = strLine.substring(0, strLine.length()).split(" ");
				for (int i = 0; i < name.length; i++) {
					if (name[i].equals("mac")) {
						System.out.println(name[i]+" , " +i);
					}

				}
				if (specificindex == true) {
					System.out.println("to check the condition :" + strLine + "," + specificindex);
				} else {
					System.out.println("the word is not found");
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Unable to find the file: fileName");
		} catch (IOException e) {
			System.err.println("Unable to read the file: fileName");
		}
	}
}
