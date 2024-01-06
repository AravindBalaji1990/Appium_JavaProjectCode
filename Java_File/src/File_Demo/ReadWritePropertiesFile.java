package File_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) {
		FileOutputStream out = null;
		FileInputStream in = null;
		try {
			Properties prop = new Properties();
			File f = new File("./DataTextFile/testdatainput.properties");
			in = new FileInputStream(f);
			prop.load(in);
			prop.setProperty("url", "www.facebook.com");
			
			out= new FileOutputStream(f);
			
			prop.store(out, null);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
