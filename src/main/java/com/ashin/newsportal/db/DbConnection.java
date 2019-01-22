package com.ashin.newsportal.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getMySqlConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kantipur", "root", "");
		}catch (Exception e) {}
		
		return conn;
	}
}
