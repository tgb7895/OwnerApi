package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getactivitylist.GetActivityList;
import com.raintea.dao.impl.GetActivityListDAOJdbcImpl;

/**
 * Servlet implementation class GetActivityListServlet
 */
@WebServlet("/Activity/getActivityList")
public class GetActivityListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String community_id=request.getParameter("community_id");
		String owner_id=request.getParameter("owner_id");
		
		GetActivityListDAOJdbcImpl g=new GetActivityListDAOJdbcImpl();
		GetActivityList getActivityList=g.get(Integer.parseInt(community_id),Integer.parseInt(owner_id));
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(getActivityList));
	}

}
