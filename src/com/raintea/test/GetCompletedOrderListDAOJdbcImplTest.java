package com.raintea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.raintea.dao.impl.GetCompletedOrderListDAOJdbcImpl;

class GetCompletedOrderListDAOJdbcImplTest {

	@Test
	void test() {
		GetCompletedOrderListDAOJdbcImpl fg=new GetCompletedOrderListDAOJdbcImpl();
		
		System.out.println(JSON.toJSONString(fg.getList(2)));
	}

}
