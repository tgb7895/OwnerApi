package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.ChangeOwnerRandDAOJdbcImpl;
import com.raintea.dao.impl.ChangePasswordDAOJdbcImpl;

@WebServlet("/User/changePassword")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String owner_id=request.getParameter("owner_id");
		String password=request.getParameter("password");
		
		ChangePasswordDAOJdbcImpl sdj=new ChangePasswordDAOJdbcImpl();
		Success sc=sdj.updatePassword(Integer.parseInt(owner_id),password);
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(sc));
	}

}
