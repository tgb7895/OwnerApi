package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getcomment.GetComment;
import com.raintea.dao.GetCommentDAO;
import com.raintea.dao.impl.GetCommentDAOJdbcImpl;


@WebServlet("/Comment/getComment")
public class GetCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String owner_id=request.getParameter("owner_id");
		String repair_id=request.getParameter("repair_id");
		
		
		GetCommentDAO getcommentdao=new GetCommentDAOJdbcImpl();
		
		GetComment getcomment=getcommentdao.get(Integer.parseInt(owner_id), Integer.parseInt(repair_id));
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(getcomment));
	}

}
