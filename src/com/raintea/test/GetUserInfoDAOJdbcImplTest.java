package com.raintea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getuserinfo.GetUserInfo;
import com.raintea.dao.impl.GetUserInfoDAOJdbcImpl;

class GetUserInfoDAOJdbcImplTest {

	@Test
	void test() {
		
		GetUserInfoDAOJdbcImpl gus=new GetUserInfoDAOJdbcImpl();
		
		GetUserInfo gui=gus.getUser(1);
		
		System.out.println(JSON.toJSONString(gui));
		
	}

}
