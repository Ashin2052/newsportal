package com.ashin.newsportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ashin.newsportal.db.*;;

public class UserDaoImpl implements UserDao {

	Connection conn = null;

	@Override
	public void createuser(String userName, String password) {
		if (conn != null) {
			String sql = "INSERT INTO login(UserName, pwd) VALUES (?, ?)";
			Connection conn = DbConnection.getMySqlConnection();
			PreparedStatement preparedStatement;
			try {
				System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd" +sql);
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, userName);
				preparedStatement.setString(2, password);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd" +sql);

		}

	}

	@Override
	public void initConnection() {
		conn = DbConnection.getMySqlConnection();

	}

	@Override
	public boolean isValiduser(String userName, String password) {
		try {
			String sql = "select * from login where name='" + userName + "' and password='" + password + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			boolean hasUser = rs.next();
			return hasUser;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
