package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getcompletedorderlist.GetCompletedOrderList;
import com.raintea.dao.impl.GetCompletedOrderListDAOJdbcImpl;

@WebServlet("/Order/getCompletedOrderList")
public class GetCompletedOrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String owner_id=request.getParameter("owner_id");
		
		GetCompletedOrderListDAOJdbcImpl gcoldji=new GetCompletedOrderListDAOJdbcImpl();
		
		GetCompletedOrderList sc= gcoldji.getList(Integer.parseInt(owner_id));
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(sc));
		 
		
	}

}
