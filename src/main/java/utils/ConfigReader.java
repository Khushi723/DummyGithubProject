package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
public Properties prop;
	
	public Properties readProperties() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "/src/test/resources/config/config.properties");         
            prop.load(ip);
        	} 
        catch (FileNotFoundException e) {
        		e.printStackTrace();
        	}
        catch (IOException e) {
        		e.printStackTrace();
        	}
        	return prop;
    		}
}
