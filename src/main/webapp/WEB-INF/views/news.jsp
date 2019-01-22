<%@page import="java.util.List"%>
<%@ page import = "com.ashin.newsportal.model.News" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

		<tr>
			<td>Title</td>
		</tr>

		 
		 <%     List<News> nlist = (List<News>)request.getAttribute("news"); %>
		 
		   <%  for(News n : nlist){	  %>
		    	  <% System.out.println("dascada"); %>
		  <tr>
				<td><%= n.getTitle() %></td>
                				<td><%= n.getDescription() %></td>
                				
			</tr>
		  
		    	
		 <% } %>
	</table>
</body>
</body>
</html>