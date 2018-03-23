package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getuserinfo.GetUserInfo;
import com.raintea.dao.impl.GetUserInfoDAOJdbcImpl;


@WebServlet("/User/getUserInfo")
public class GetUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String owner_id=request.getParameter("owner_id");
	
		
		GetUserInfoDAOJdbcImpl gus=new GetUserInfoDAOJdbcImpl();
		
		GetUserInfo gui=gus.getUser(Integer.parseInt(owner_id));
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		
		 response.getWriter().write(JSON.toJSONString(gui));
	}

}
