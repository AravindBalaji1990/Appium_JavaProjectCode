package File_Demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFileDemo {

	public static void main(String[] args) {
		try {
			// read the file from the location
			InputStream inputdata = new FileInputStream("./DataTextFile/testdatainput.properties");

			// we are loading the file input in properties
			Properties prop = new Properties();
			prop.load(inputdata);

			// retrieve the data
			System.out.println("the username from the properties file : " + prop.getProperty("username"));
			System.out.println("the password from the properties file : " + prop.getProperty("password"));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
