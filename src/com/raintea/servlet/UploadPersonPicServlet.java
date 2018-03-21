package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.UploadPersonPicDAOJdbcImpl;

/**
 * Servlet implementation class UploadPersonPicServlet
 */
@WebServlet("/User/uploadPersonPic")
public class UploadPersonPicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String owner_id=request.getParameter("owner_id");
		String image=request.getParameter("image");
		
		
		UploadPersonPicDAOJdbcImpl uppdji=new UploadPersonPicDAOJdbcImpl();
		Success sc=uppdji.updatePic(Integer.parseInt(owner_id)
				, image);
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(sc));
		
	}

}
