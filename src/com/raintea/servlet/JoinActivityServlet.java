package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.JoinActivityDAOJdbcImpl;

/**
 * Servlet implementation class JoinActivityServlet
 */
@WebServlet("/Activity/joinActivity")
public class JoinActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		activity_id int 活动编号 不可空
//		参加人数 join_num int 参加人数 不可空
//		备注信息 join_content String 备注信息 可空
//		用户编号 owner_id
		String activity_id=request.getParameter("activity_id");
		String join_num=request.getParameter("join_num");
		String join_content=request.getParameter("join_content");
		String owner_id=request.getParameter("owner_id");
		
		JoinActivityDAOJdbcImpl jadji=new JoinActivityDAOJdbcImpl();
		
		Success success=jadji.getSuc(Integer.parseInt(activity_id),Integer.parseInt(join_num),join_content,Integer.parseInt(owner_id));
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(success));
		
	}

}
