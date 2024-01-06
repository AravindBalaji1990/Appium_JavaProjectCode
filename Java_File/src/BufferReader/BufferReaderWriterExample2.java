package BufferReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// FileInputStream - > it reads only the raw byte (integer)
		// FileReader -> it reads only as character by character
		// BufferedReader -> it reads a chunk of lines together
		// BufferedReader is greater than filereader in hierarchy
		// A program to check write data to a buffer memory and write it back to a file
		// buffer memory default size - 8192 characters
		// buffer memory default lines size - 80 lines

		// Get the empty file from the folder
		File file = new File("./writetext/Data_Write.txt");

		/* Writing file using BufferedWriter */
		/* We are initialising it */
		FileWriter fileWriter = null;// where i want to write
		BufferedWriter bufferedWriter = null;// what i want to write
		try {
			// send the locatoin where to write the file
			fileWriter = new FileWriter(file);
			// from the location to write the file send the data to write inside the file
			bufferedWriter = new BufferedWriter(fileWriter);
			// below is the content to write inside the file
			bufferedWriter.write("This is an example for to use \n");
			bufferedWriter.write("of using BufferedWriter and \n");
			bufferedWriter.write("BufferedReader. \n");
			bufferedWriter.write(" This is my first line 26 june 2023.");
			// empties the contents after write
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.close();
				}
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/* Reading from the file using BufferedReader */
		FileReader fileReader = null;// From where i want to read
		BufferedReader bufferedReader = null; // what i want to read from file reader
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("The content that was written : " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}