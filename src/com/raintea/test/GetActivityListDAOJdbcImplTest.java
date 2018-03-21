package com.raintea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.getactivitylist.GetActivityList;
import com.raintea.dao.impl.GetActivityListDAOJdbcImpl;

class GetActivityListDAOJdbcImplTest {

	@Test
	void test() {
		GetActivityListDAOJdbcImpl g=new GetActivityListDAOJdbcImpl();
		GetActivityList getActivityList=g.get(1, 1);
		System.out.println(JSON.toJSONString(getActivityList));
	}

}
