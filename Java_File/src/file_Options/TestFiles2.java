package file_Options;

import java.io.File;

public class TestFiles2 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\aravind\\Desktop\\Selenium_Class");
		File[] fileList = file.listFiles();
		for(int i =0;i<fileList.length;i++) {
			System.out.println(fileList[i]);
		}

	}

}
