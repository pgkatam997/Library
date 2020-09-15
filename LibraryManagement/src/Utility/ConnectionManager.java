package Utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {
		Connection con = null;
		try {
		Properties prop  = loadPropertiesFile() ;
		Class.forName(prop.getProperty("driver"));
	  con =	DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
	
		}catch (Exception e) {
				System.out.println(e.getMessage());
		}
		return con;
	
	}
	private static Properties loadPropertiesFile() throws IOException {
		
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
	}


