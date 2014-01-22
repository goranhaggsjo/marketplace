package se.gozacke.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
//	private final String jdbcDriver;
//	private final String dbUrl;
//	private final String user;
//	private final String pass;
	
//	public Database() {
//		jdbcDriver = "com.mysql.jdbc.Driver";
//		dbUrl = "jdbc:mysql://localhost/floggit";
//		user = "root";
//		pass = "";
//	}
	
//	public Database(String jdbcDriver, String dbUrl, String user, String pass) {
//		this.jdbcDriver = jdbcDriver;
//		this.dbUrl = dbUrl;
//		this.user = user;
//		this.pass = pass;
//	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost/floggit";
		String user = "flogger";
		String pass = "flogged";
		Class.forName(jdbcDriver);
		Connection conn = DriverManager.getConnection(dbUrl, user, pass);
		return conn;
	}
}