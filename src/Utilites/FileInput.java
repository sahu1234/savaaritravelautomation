package Utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileInput {
	/**
	 * This method is used to take input from the properties file that is available
	 * inside the project.
	 * 
	 * @return Properties
	 * @throws IOException
	 */

	public String getData(String field) throws IOException {
		
		// Locating the input file, loading that into the property class and returning
		// the same
		FileInputStream fis = new FileInputStream("C:\\Users\\922462\\OneDrive - Cognizant\\Desktop\\Testing Imp\\Selenium Rahul shetty\\Eclipse workspace\\com.cognizant.savaari\\input.properties");
		Properties property = new Properties();
		property.load(fis);
		String fld = property.getProperty(field);
		return fld;

	}

}
