package BaseFuncMethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ReadProperties {
	private Properties pro = new Properties();
	private String value = null;

	public ReadProperties(String filePath) {
		this.readFile(filePath);
	}

	public void readFile(String filePath) {
		File file = new File(filePath);

		try {
			InputStream in = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			pro.load(br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getValue(String key) {
		value = pro.getProperty(key).trim();
		try {
			value = new String(value.getBytes("UTF-8"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	
	  /* public static void main(String[] args) { 
		  String fileDataPath = System.getProperty("user.dir") + "\\xpathLocated\\UIXpath.properties";
		  try {
			  ReadProperties readProperties = new ReadProperties(fileDataPath);
			  System.out.println(readProperties.getValue("test.Data")); } 
		  catch (Exception e) {
			  // TODO: handle exception e.printStackTrace(); 
			  e.printStackTrace();
		  }
	  } */
	 
	 
}
