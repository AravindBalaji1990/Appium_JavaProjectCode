package File_Demo;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) {
		try {
			
			// here we input what location we are using to write the data
			OutputStream outputdata = new FileOutputStream("./DataTextFile/testdatainput.properties");
			
			// java util properties to set the proprties 
			Properties prop = new Properties();
			// below item we set the property
			prop.setProperty("url", "www.facebook.com");
			prop.store(outputdata, null);
			
			// we retrieve the property
			System.out.println(prop);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
