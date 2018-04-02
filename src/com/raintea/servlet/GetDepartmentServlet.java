package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getdepartment.GetDepartment;
import com.raintea.dao.impl.GetDepartmentDAOJdbcImpl;


@WebServlet("/Department/getDepartment")
public class GetDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String community_id=request.getParameter("community_id");
		
		GetDepartmentDAOJdbcImpl gddji=new GetDepartmentDAOJdbcImpl();
		
		GetDepartment tts=gddji.getList(Integer.parseInt(community_id));
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		response.getWriter().write(JSON.toJSONString(tts));
	}

}
