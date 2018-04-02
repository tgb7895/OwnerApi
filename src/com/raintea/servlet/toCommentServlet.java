package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.toCommentDAOJdbcImpl;

/**
 * Servlet implementation class toCommentServlet
 */
@WebServlet("/Comment/toComment")
public class toCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		���ۼ��� level int ����ά���Ǽ� ���ɿ�
//		����id repair_id int ά����Աid ���ɿ�
//		�������� content String �������� ���ɿ�
		String level=request.getParameter("level");
		String repair_id=request.getParameter("repair_id");
		String content=request.getParameter("content");
		
		
		toCommentDAOJdbcImpl tcdj=new toCommentDAOJdbcImpl();
		Success success=tcdj.setComment(Integer.parseInt(level),repair_id,content);
		
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(success));
		
		
	}

}
