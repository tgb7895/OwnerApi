package com.raintea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.raintea.dao.impl.GetOrderDAOJdbcImpl;

class GetOrderDAOJdbcImplTest {

	@Test
	void test() {
		GetOrderDAOJdbcImpl godji=new GetOrderDAOJdbcImpl();
	
		godji.get("1");
		

	}

}
