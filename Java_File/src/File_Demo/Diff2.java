package File_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Diff2 {

	public static void main(String[] args) throws IOException {
		// reading data using FileReader
		System.out.println("Reding text file using FileReader");
		try {
			FileReader fr = new FileReader("./DataTextFile/SampleInput.txt");
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// reading data using FileInpustStream
		System.out.println("Reding text file using FileInputStream");
		try {
			FileInputStream fis = new FileInputStream("./DataTextFile/SampleInput.txt");
			int b = fis.read();
			while (b != -1) {
				System.out.print(b);
				b = fis.read();
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
