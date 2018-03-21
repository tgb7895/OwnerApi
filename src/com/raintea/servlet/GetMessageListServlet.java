package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getmessagelist.GetMessageList;
import com.raintea.dao.impl.GetMessageListDAOJdbcImpl;


@WebServlet("/message/getMessageList")
public class GetMessageListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String community_id=request.getParameter("community_id");
		String owner_id=request.getParameter("owner_id ");  //有问题 没有用到owner_id
		

		GetMessageListDAOJdbcImpl gmldji=new GetMessageListDAOJdbcImpl();
		GetMessageList getMessageList=gmldji.get(Integer.parseInt(community_id),1);
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(getMessageList));
		
	}

}
