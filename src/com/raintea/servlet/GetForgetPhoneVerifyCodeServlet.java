package com.raintea.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getforgetphoneverifycode.GetForgetPhoneVerifyCode;
import com.raintea.dao.impl.GetForgetPhoneVerifyCodeDAOJdbcImpl;

//≤‚ ‘http://localhost:8080/OwnerApi/User/getForgetPhoneVerifyCode?phonenum=1
@WebServlet("/User/getForgetPhoneVerifyCode")
public class GetForgetPhoneVerifyCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phonenum=request.getParameter("phonenum");
		
		GetForgetPhoneVerifyCodeDAOJdbcImpl gfpvcdji=new GetForgetPhoneVerifyCodeDAOJdbcImpl();
		
		GetForgetPhoneVerifyCode getForgetPhoneVerifyCode=gfpvcdji.get(phonenum);
		
		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.getWriter().write(JSON.toJSONString(getForgetPhoneVerifyCode));
	}

}
