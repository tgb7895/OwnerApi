package com.raintea.test;

import org.junit.Test;

import com.raintea.dao.impl.AddOrderDAODAOJdbcImpl;

public class addOrderDAODAOJdbcImplTest {

	
	@Test
	public void getAddressValueTest() {
		String sqlAdress="select home_address from tenement_owner;";
		AddOrderDAODAOJdbcImpl im=new AddOrderDAODAOJdbcImpl();
		
		im.addorders(1, 1, 1, "2007-11-20", "gfdgdfgdg", "“¯––µπ±’¡À");
	}
}
