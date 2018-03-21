package com.raintea.dao;

import com.raintea.bean.Community;
import com.raintea.bean.login.LoginBean;
import com.raintea.bean.login.LoginBeanT;

public interface LoginDAO {
	
	public LoginBeanT get(String phone,String passowrd);
	
}
