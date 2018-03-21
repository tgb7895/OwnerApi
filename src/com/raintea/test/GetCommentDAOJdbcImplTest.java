package com.raintea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.raintea.dao.impl.GetCommentDAOJdbcImpl;

class GetCommentDAOJdbcImplTest {

	@Test
	void test() {
		GetCommentDAOJdbcImpl gcdji=new GetCommentDAOJdbcImpl();
		
		gcdji.get(2,3);
		
	}

}
