package com.raintea.test;


import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.raintea.db.JdbcUtils;

class JdbcUtilsTest {

	@Test
	void testGetConnection() throws SQLException {
		Connection connection=JdbcUtils.getConnection();
		System.out.println(connection);
	}

}
