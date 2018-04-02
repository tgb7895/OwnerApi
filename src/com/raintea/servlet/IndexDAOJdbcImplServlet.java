package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.index.Index;
import com.raintea.dao.impl.IndexDAOJdbcImpl;



@WebServlet("/Index/Index")
public class IndexDAOJdbcImplServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String community_id=request.getParameter("community_id");
		String owner_id=request.getParameter("owner_id");
		
		
		
		IndexDAOJdbcImpl idji=new IndexDAOJdbcImpl();
		Index index=idji.getall(Integer.parseInt(community_id),Integer.parseInt(owner_id));
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		
		 response.getWriter().write(JSON.toJSONString(index));
	}

}
