package com.raintea.test;

import org.junit.Test;

import com.raintea.dao.impl.GiveOutTheNewsDAOJdbcImpl;

public class GiveOutTheNewsDAOJdbcImplTest {

	
	@Test
	public void GiveOutTheNewsDAOJdbcImplTests() {
		
		GiveOutTheNewsDAOJdbcImpl gt=new GiveOutTheNewsDAOJdbcImpl();
		
		
		gt.updateNews("�����", "����", 6);
		
		
	}
}
