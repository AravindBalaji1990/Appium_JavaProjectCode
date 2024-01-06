package File_Demo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Diff {

	public static void main(String[] args) {
		// Example 1 - Reading File's content using FileInputStream
		try {
			FileInputStream fis = new FileInputStream("./DataTextFile/SampleInput.txt");
			int data = fis.read();
			while (data != -1) {
				System.out.println(Integer.toHexString(data));
				data = fis.read();
			}
		} catch (IOException e) {
			System.out.println("Failed to read binary data from File");
			e.printStackTrace();
		}
		// Example 2 - Reading File data using FileReader in Java
		try {
			FileReader reader = new FileReader("./DataTextFile/SampleInput.txt");

			int character = reader.read();
			while (character != -1) {
				System.out.println((char) character);
				character = reader.read();
			}
		} catch (IOException io) {
			System.out.println("Failed to read character data from File");
			io.printStackTrace();
		}
	}

}
