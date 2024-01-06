package absolutepathdemo;

import java.io.File;

public class RetireveAbsolutePath {

	public static void main(String[] args) {
		// I need to identify the file inside my java folder
		File file = new File("output_write.txt");
		// getAbsolutePath -> it will retrive the path wiht in the project structure
		String path = file.getAbsolutePath();
		System.out.println(path);
	}

}
