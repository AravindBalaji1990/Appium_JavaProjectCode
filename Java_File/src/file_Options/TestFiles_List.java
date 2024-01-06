package file_Options;

import java.io.File;

public class TestFiles_List {

	public static void main(String[] args) {
		// List of folder available in the file path
		// Provide a meaning full path path for below
		File file = new File("/Users/aravindbalaji/Documents/SeleniumDocuments");
		String[] fileList = file.list();
		for (int i = 0; i < fileList.length; i++) {
			System.out.println(fileList[i]);
		}

	}

}
