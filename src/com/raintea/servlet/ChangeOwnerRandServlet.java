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

/**
 * Servlet implementation class ChangeOwnerRandServlet
 */
@WebServlet("/User/changeOwnerRand")
public class ChangeOwnerRandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone=request.getParameter("phone");
		String rand_id=request.getParameter("rand_id");
		
		ChangeOwnerRandDAOJdbcImpl sdj=new ChangeOwnerRandDAOJdbcImpl();
		Success sc=sdj.updatehome(phone, rand_id);
		
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(sc));
		
	}

}
