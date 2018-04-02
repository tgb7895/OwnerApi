package com.raintea.test;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getdepartment.GetDepartment;
import com.raintea.dao.impl.GetDepartmentDAOJdbcImpl;


public class GetDepartmentDAOJdbcImplTest {
	@Test
	void test() {
		GetDepartmentDAOJdbcImpl gddji=new GetDepartmentDAOJdbcImpl();
		
		GetDepartment tts=gddji.getList(1);
		
		System.out.println(JSON.toJSON(tts));
		
	}
}
