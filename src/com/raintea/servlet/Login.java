package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.login.LoginBeanT;
import com.raintea.dao.LoginDAO;
import com.raintea.dao.impl.LoginDAOJdbcImpl;







@WebServlet("/User/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone=request.getParameter("phone");
		String password=request.getParameter("password");
		
		
		LoginDAO logindao=new LoginDAOJdbcImpl();
		
		
		LoginBeanT toolsTest=logindao.get(phone,password);
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		response.getWriter().write(JSON.toJSONString(toolsTest));
	}

}
