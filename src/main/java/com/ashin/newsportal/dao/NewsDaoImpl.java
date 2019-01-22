package com.ashin.newsportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;


import com.ashin.newsportal.db.DbConnection;
import com.ashin.newsportal.model.News;

public class NewsDaoImpl implements NewsDao {

	Connection conn = DbConnection.getMySqlConnection();

	@Override
	public List<News> listNews() {
		// get news - task
		// database connection
		// query in table
		// create statement
		// statement returns the value in resultset
		// loop through the resultset and map to the news model
		// finally populate the newslist in the view
		Connection conn = DbConnection.getMySqlConnection();

			
		List<News> newsList = new ArrayList<News>();
		if (conn != null) {
			String sql = "SELECT * FROM news";
			try {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
//				System.out.println("==== has data ==== : " + rs.next());

				while (rs.next()) {
					News news = new News();
					news.setTitle(rs.getString("title"));
					news.setDescription(rs.getString("description"));
					news.setImage(rs.getString("Image"));
					System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd");
				
					newsList.add(news);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Mysql connection faled");
		}
		return newsList;
	}

	


	

	@Override
	public void DeleteNews(String newsId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertnews(String tle, String dsrp, String img, String cat)
 {
		
		System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd");

		// TODO Auto-generated method stub
		if (conn != null) {
			String sql = "INSERT INTO news(title, description,Image) VALUES ( ?,?,?)";
			Connection conn = DbConnection.getMySqlConnection();
			PreparedStatement preparedStatement;
			try {
				System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd" +sql);
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, tle);
				preparedStatement.setString(2, dsrp);
				preparedStatement.setString(3, img);
				System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd" +sql);


				preparedStatement.executeUpdate();
				System.out.println("dfasfda vdvd dfgd dvdvd dvd dvd" +sql);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}






	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub
		
	}

}
