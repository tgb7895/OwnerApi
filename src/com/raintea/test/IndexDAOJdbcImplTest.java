package com.raintea.test;

import org.junit.Test;

import com.raintea.dao.impl.IndexDAOJdbcImpl;

public class IndexDAOJdbcImplTest {

	
	@Test
	public void IndexTest() {
		
		IndexDAOJdbcImpl idji=new IndexDAOJdbcImpl();
		
		idji.getall(1,1);
		
		
	}
}
