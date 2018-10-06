package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LottoDB {
	private static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/";
	private static String USERNAME = "root";
	private static String PASSWORD = "green1698";
	private static String DATABASE = "lotto";
	
	private static Connection connection = null;

	private LottoDB() {
	}

	public static synchronized Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName(DRIVER_NAME);
				connection = DriverManager.getConnection(URL + DATABASE + "?autoReconnect=true&useSSL=false",
						USERNAME, PASSWORD);
				System.out.println("[MYSQL] Connection successful");
			} catch (SQLException e) {
				System.out.println("[MYSQL] Connection failed!");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("[MYSQL] Connection failed!");
				e.printStackTrace();
			}
		}
		
		return connection;
	}
}
