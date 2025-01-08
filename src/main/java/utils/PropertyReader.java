package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	private static Properties prop;

	public PropertyReader(String env) {
		prop=new Properties();
		try {
			System.out.println("System Property: "+env);
			prop.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/"+env+".properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
