package com.ashin.newsportal.dao;

import java.util.List;

import com.ashin.newsportal.model.News;

public interface NewsDao {
	public List<News> listNews();
    public void DeleteNews(String newsId);
	public void initConnection();
	public void addNews(News news);
	 public void insertnews(String tle, String dsrp, String img, String cat);
}
