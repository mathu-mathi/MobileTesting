package utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import constant.FileConstant;

public class FileUtilis {
	//Fetching desired capabilities from properties file
	
	public static String getProperty(String key) throws IOException 
	{
		FileInputStream fileInputStream = null;
		fileInputStream = new FileInputStream(FileConstant.FOLDER_PATH);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key);
	}
	
}
