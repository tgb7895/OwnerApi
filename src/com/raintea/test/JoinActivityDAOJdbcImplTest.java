package com.raintea.test;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.success.Success;
import com.raintea.dao.impl.JoinActivityDAOJdbcImpl;


public class JoinActivityDAOJdbcImplTest {

	@Test
	void test() {
		
		JoinActivityDAOJdbcImpl jadji=new JoinActivityDAOJdbcImpl();
		
		Success success=jadji.getSuc(8, 7, "·Å»ðÈ¥", 5);
		
		
		System.out.println(JSON.toJSONString(success));
		
	}
	
}
