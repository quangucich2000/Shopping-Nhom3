package com.nhom3.ultils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {

	public static final String RESOURCE_FOLDER_URL = "C:\\Users\\Quang Le\\eclipse-workspace\\Shopping-Nhom3\\src\\main\\java\\resources\\";

	private Properties properties;

	public DatabaseProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_FOLDER_URL + "database.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
