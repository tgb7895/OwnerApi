package com.raintea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.login.LoginBean;
import com.raintea.bean.login.LoginBeanT;
import com.raintea.dao.LoginDAO;
import com.raintea.dao.impl.LoginDAOJdbcImpl;

class LoginDAOJdbcImplTest {

	
	@Test
	void testGetStringString() {
//		LoginBean loginDAO=logindao.get(null, null);
//		
//		ToolsTest toolsTest=new ToolsTest();
//		toolsTest.setLoginBean(loginDAO);
//		toolsTest.setErrCode("0001");
//		toolsTest.setErrMsg("");
//		toolsTest.setRetCode("");
		LoginDAO logindao=new LoginDAOJdbcImpl();
		LoginBeanT toolsTest=logindao.get("18932133223", "admin");
		
		System.out.println(JSON.toJSONString(toolsTest));
	}

}
