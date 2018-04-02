package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.AddOrderDAODAOJdbcImpl;

/**
 * Servlet implementation class AddOrder
 */
@WebServlet("/Order/addOrder")
public class AddOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		用户id owner_id int 用户id 不可空
//		小区id community_id int 小区id 不可空
//		小区报修部门id department_id int 小区报修部门id 不可空
//		预约时间 appointment_t
//		ime String 预约时间 不可空
//		报修图片 images array 报修图片 不可空
//		报修原因 case String 报修原因 不可
		
		String owner_id=request.getParameter("owner_id");
		String community_id=request.getParameter("community_id");
		String department_id=request.getParameter("department_id");
		String appointment_time=request.getParameter("appointment_time");
		String images=request.getParameter("images");
		String cause=request.getParameter("case");
		
		
		AddOrderDAODAOJdbcImpl im=new AddOrderDAODAOJdbcImpl();
		
		
		Success success=im.addorders(Integer.parseInt(owner_id),Integer.parseInt(community_id),Integer.parseInt(department_id)
				,appointment_time,images,cause);
		
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(success));
		
		
		
	}

}
