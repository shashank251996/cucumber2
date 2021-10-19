package Common;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public class ConfigManager {
	private static ConfigManager config;
	private static String filePath = System.getProperty("user.dir")
			+ "/src/main/resources/Properties/ConfigProperties.properties";
	private Properties properties;

	private ConfigManager() {
		try {
			FileInputStream file = new FileInputStream(filePath);
			System.out.println("file path is :"+filePath);
			properties = new Properties();
			properties.load(file);

		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Not able to lad property form file :" + filePath);
		}
	}

	public static ConfigManager getInstance() {
		return (config == null) ? config = new ConfigManager() : config;
	}

	public String getProperty(String propertyName) {
		return this.properties.getProperty(propertyName);
	}
	
	public static void main(String[] args) {
		System.out.println(ConfigManager.getInstance().getProperty("driverPath"));
	}

}
