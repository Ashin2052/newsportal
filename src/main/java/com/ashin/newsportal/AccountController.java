package com.ashin.newsportal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashin.newsportal.dao.NewsDao;
import com.ashin.newsportal.dao.NewsDaoImpl;
import com.ashin.newsportal.dao.UserDao;
import com.ashin.newsportal.dao.UserDaoImpl;
import com.ashin.newsportal.model.News;

@Controller
public class AccountController {
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String account(Model model) {	
		System.out.println("Controller in login");
		return "loginjsp";
	}
	
	@RequestMapping(value = "/found", method = RequestMethod.GET)
	public String userNotFound(Model model) {	
		System.out.print("Controller in login");
		return "home";
	}
	
	@RequestMapping(value = "/account/user", method = RequestMethod.POST)
	public String loggedAccounts(HttpServletRequest request) {	
		System.out.println("fsdfa");
		String username = request.getParameter("uname");
		String pwd =request.getParameter("pwd");
		UserDao ud = new UserDaoImpl();
		ud.initConnection();
		ud.createuser(username, pwd);
		return "NewFile";
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String Insertcon(HttpServletRequest request) {	
		System.out.println("fsdfa");
		String tle = request.getParameter("title");
		String dsrp =request.getParameter("description");
		String img =request.getParameter("image");
		String cat =request.getParameter("catagory");
		
        
		System.out.println("dfasfda asg sgsgsgsgsgs sysy sysysd" );

		NewsDao xx = new NewsDaoImpl();
		xx.initConnection();
		xx.insertnews(tle,dsrp,img, cat);
		return "NewFile";
	}
	
	
	
	
	@RequestMapping(value = "/account/login", method = RequestMethod.POST)
	public void logIn(HttpServletRequest request, HttpServletResponse response) {	
		String username = request.getParameter("uname");
		String pwd =request.getParameter("pwd");
		UserDao ud = new UserDaoImpl();
		ud.initConnection();
		boolean validuser = ud.isValiduser(username, pwd);
		
		try {
		if(validuser) {
			 response.sendRedirect("http://localhost:8080/testapp");
		}else {
			response.sendRedirect("http://localhost:8080/testapp/notfound");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
