package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getorder.GetOrder;
import com.raintea.dao.GetOrderDAO;
import com.raintea.dao.impl.GetOrderDAOJdbcImpl;

/**
 * Servlet implementation class GetOrderServlet
 */
@WebServlet("/Order/getOrder")
public class GetOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String owner_id=request.getParameter("owner_id");
		
		GetOrderDAO god=new GetOrderDAOJdbcImpl();
		
		GetOrder go=god.get(owner_id);
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  

		
		response.getWriter().write(JSON.toJSONString(go));
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
