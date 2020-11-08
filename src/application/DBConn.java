package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql:"
				+ "//localhost:3306/"
				+ "bosniawhere?autoReconnect=true&useSSL=false" ,"root","");
	
		return connection;
	}
	

}
