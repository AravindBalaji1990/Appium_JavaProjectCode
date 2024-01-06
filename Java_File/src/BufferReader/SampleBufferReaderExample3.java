package BufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleBufferReaderExample3 {

	public static void main(String[] args) throws IOException {
		int buffersize = 8*1024;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("./DataTextFile/SampleInput.txt"),buffersize);
		 String line ;
		    while((line= bufferedReader.readLine()) != null) {
		        //do something with line

		        //line = bufferedReader.readLine();
		        System.out.println(line);
		    }
		    bufferedReader.close();
	}

}
