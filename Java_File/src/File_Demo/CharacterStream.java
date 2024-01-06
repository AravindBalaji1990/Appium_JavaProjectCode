package File_Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String args[]) {
		CharacterStream obj = new CharacterStream();
		obj.samplefilereaderwriter();

	}

	// non-static method
	public void samplefilereaderwriter() {
		// initialising the values of FileReader and FileWriter
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("./DataTextFile/SampleInput.txt");
			out = new FileWriter(System.getProperty("user.dir") + "/writetext/output_write.txt");

			int c;
			while ((c = in.read()) != -1) {
				System.out.println("the charcter data :" + c);
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Executed");
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Executed");
			}
		}

	}
}
