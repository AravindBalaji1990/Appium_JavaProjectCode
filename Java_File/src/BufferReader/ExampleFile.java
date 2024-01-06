package BufferReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleFile {

	public static void main(String[] args) throws IOException {
		// Initialisation of the inputstream and output stream
				// Read ur file
				FileInputStream inputfile = null;
				// Write ur file from what is being
				FileOutputStream outputfile = null;

				try {
					inputfile = new FileInputStream("./DataTextFile/SampleInput.txt");
					outputfile = new FileOutputStream(
							"/Users/aravindbalaji/Documents/eclipse-workspace/Java_File/writetext/testwrite.txt");

					// We have used c as a temporary integer to store the data from
					// input.txt
					int c;
					while ((c = inputfile.read()) != -1) {
						// this is going to print the ascii value of the data in the input.txt
						System.out.println(c);
						// this place is where the write operation happens
						outputfile.write(c);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (inputfile != null) {
						inputfile.close();
						System.out.println("executed");
					}
					if (outputfile != null) {
						outputfile.close();
						System.out.println("executed");
					}
				}
	}

}
