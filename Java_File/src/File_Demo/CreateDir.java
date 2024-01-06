package File_Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateDir {

	// this program is to check whether the directory can be created at runtime
	public static void main(String[] args) throws FileNotFoundException {
		// path of the directory
		String dirname = System.getProperty("user.dir") + "/MyFolder_Aravind";
		// try to get the date and time stamp of ur system time(dd_MM_yyyy_HH_mm_ss)
		// Localtime,Calendar - keywords to use
		File d = new File(dirname);
		// Create directory now.
		// if not available
		// exists -> will check for the folder availability
		if (!d.exists()) {
			// command to create a directory
			d.mkdirs();
			System.out.println("the folder is created as new");
		} else {
			System.out.println("folder already exists");
		}
	}

}
