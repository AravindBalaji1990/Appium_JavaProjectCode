package BufferReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFile2 {

	public static void main(String[] args) {
		// variable declaration
		int ch;

		// check if File exists or not
		FileReader fr = null;
		try {
			fr = new FileReader("./DataTextFile/SampleInput.txt");
			// read from FileReader till the end of file
			while ((ch = fr.read()) != -1)
				System.out.print((char) ch);
			// close the file
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Exception found" + e);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
