package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.GiveOutTheNewsDAOJdbcImpl;

/**
 * Servlet implementation class GiveOutTheNewsServlet
 */
@WebServlet("/Message/giveOutTheNews")
public class GiveOutTheNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		标题 title string 消息标题 不可空
//		内容 content string 消息内容 不可空
//		小区id community_id int 小区id 
		
		
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String community_id=request.getParameter("community_id");
		
		GiveOutTheNewsDAOJdbcImpl gt=new GiveOutTheNewsDAOJdbcImpl();
		
		
		Success success=gt.updateNews(title,content,Integer.parseInt(community_id));
		
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		
		 response.getWriter().write(JSON.toJSONString(success));
	}

}
