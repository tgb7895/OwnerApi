package com.raintea.test;

import org.junit.Test;

import com.raintea.dao.impl.toCommentDAOJdbcImpl;

public class toCommentDAOJdbcImplTest {

	@Test
	public void toc() {
		toCommentDAOJdbcImpl tcdj=new toCommentDAOJdbcImpl();
		
		tcdj.setComment(5,"2008123154", "¿×ÏéÓî");
	}
}
