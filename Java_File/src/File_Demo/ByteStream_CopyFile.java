package File_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream_CopyFile {

	public static void main(String args[]) throws IOException {

		// Initialisation of the inputstream and output stream
		// Read ur file
		FileInputStream inputfile = null;
		// Write ur file from what is being read
		FileOutputStream outputfile = null;

		try {
//			inputfile = new FileInputStream("./DataTextFile/SampleInput.txt");
			System.out.println("the user directory : " + System.getProperty("user.dir"));
			inputfile = new FileInputStream(System.getProperty("user.dir") + "/DataTextFile/SampleInput.txt");
//			outputfile = new FileOutputStream("D:\\SeleniumSession\\Test\\output_write_06_02_2021.txt");
			outputfile = new FileOutputStream(System.getProperty("user.dir") + "/writetext/output_write.txt");

			// We have used c as a temporary integer to store the data from
			// input file
			int c;
			while ((c = inputfile.read()) != -1) {
				// this is going to print the ascii value of the data in the input.txt
//				System.out.println("the file that has been read : " + c);
				// this place is where the write operation happens
				outputfile.write(c);
			}
		} catch (FileNotFoundException e) {
			// exception will be shown along with line number
			e.printStackTrace();
		} catch (IOException e) {
			// exception will be shown along with line number
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (inputfile != null) {
				// always the file should be closed from memory
				inputfile.close();
				System.out.println("executed");
			}
			if (outputfile != null) {
				// always the file should be closed from memory
				outputfile.close();
				System.out.println("executed");
			}
		}
	}
}