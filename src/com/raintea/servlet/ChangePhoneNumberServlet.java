package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.ChangePhoneNumberDAOJdbcImpl;

/**
 * Servlet implementation class ChangePhoneNumberServlet
 */
@WebServlet("/User/changePhoneNumber")
public class ChangePhoneNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	新手机号 phonenum String 新手机号 非空
//	业主id owner_id int 业主id 非空
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phonenum=request.getParameter("phonenum");
		String owner_id=request.getParameter("owner_id");
		
		ChangePhoneNumberDAOJdbcImpl gpdji=new ChangePhoneNumberDAOJdbcImpl();
		
		Success success=gpdji.getsuc(phonenum, Integer.parseInt(owner_id));
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(success));
		
	}

}
