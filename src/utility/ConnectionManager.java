package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	 public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		 Class.forName("oracle.jdbc.OracleDriver");
		 Connection con=null;
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1129ku");
		 return con;
		 
	 }
	 public static Properties loadPropertiesFile() throws Exception {
			Properties prop = new Properties();	
			InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
			prop.load(in);
			in.close(); 
			return prop;
		}
}
