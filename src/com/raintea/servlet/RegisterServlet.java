package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.RegisterDAOJdbcImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/User/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	int password, int rand_id, int phonenum
		String password=request.getParameter("password");
		String rand_id=request.getParameter("rand_id");
		String phonenum=request.getParameter("phonenum");
		
		
		
		RegisterDAOJdbcImpl rdji=new RegisterDAOJdbcImpl();
		Success success= rdji.set(Integer.parseInt(password), Integer.parseInt(rand_id), Integer.parseInt(phonenum));
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(success));
	}

}
