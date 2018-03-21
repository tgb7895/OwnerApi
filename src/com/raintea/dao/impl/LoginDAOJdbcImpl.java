package com.raintea.dao.impl;

import com.raintea.dao.DAO;
import com.raintea.dao.LoginDAO;
import com.raintea.bean.login.LoginBean;
import com.raintea.bean.login.LoginBeanT;

public class LoginDAOJdbcImpl extends DAO<LoginBean> implements LoginDAO{

	@Override
	public LoginBeanT get(String phone, String password) {
	
		LoginBeanT toolsTest=new LoginBeanT();
		String sqlTest="SELECT * FROM tenement_owner where "
				+ "telephone=? and password=?";
		LoginBean n=get(sqlTest,phone,password);
		
		if(n==null) {
			LoginBean loginbean=new LoginBean();
			toolsTest.setLoginbean(loginbean);
			toolsTest.setErrCode("0000");
			toolsTest.setErrMsg("’À∫≈ªÚ√‹¬Î¥ÌŒÛ");
			toolsTest.setRetCode("0000");
			
		}else {
		String sql="select * from login";
		toolsTest.setLoginbean(get(sql));
		toolsTest.setErrCode("0001");
		toolsTest.setErrMsg("");
		toolsTest.setRetCode("");
		}
		return toolsTest;
	}

}
