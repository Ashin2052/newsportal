package com.ashin.newsportal.dao;

public interface UserDao {
	public void initConnection();
	public void createuser(String userName, String password);
	public boolean isValiduser(String userName, String password);
}
