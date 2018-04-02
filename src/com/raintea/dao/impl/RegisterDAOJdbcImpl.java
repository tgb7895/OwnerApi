package com.raintea.dao.impl;

import java.sql.Connection;

import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.raintea.bean.register.Data;
import com.raintea.bean.register.Register;
import com.raintea.bean.success.Success;
import com.raintea.dao.DAO;
import com.raintea.dao.RegisterDAO;
import com.raintea.db.JdbcUtils;

public class RegisterDAOJdbcImpl extends DAO<Data> implements RegisterDAO{

	@Override
	public Success set(int password, int rand_id, int phonenum) {
		
		
		String sqlHos="SELECT "
				+ "community_id,"
				+ "occupier username ,"
				+ "build_number,"
				+ "unit_number,"
				+ "house_number,"
				+ "(SELECT COUNT(*)+1 FROM tenement_community_house WHERE rand_id=?) person_num "
				+ "FROM "
				+ "`tenement_community_house` "
				+ "WHERE "
				+ "tenement_community_house.rand_id=?;";
		Data data=get(sqlHos, rand_id,rand_id);
		

		
		int num=data.getCommunity_id();
		
		String sqlCom="select community_name from tenement_community where id=?";
		String Cname=getHomeName(sqlCom,data.getCommunity_id());
		
		
		String home_address="小区名字:"+Cname+"楼号:"+data.getBuild_number()+"单元号:"+data.getUnit_number()+"房间号:"+data.getHouse_number();
		

		String sql="INSERT INTO "
				+ "tenement_owner "
				+ "(`community_id`,`username`,`password`,`telephone`,`home_address`,`owner_type`,`person_num`,`rand_id`) "
				+ "VALUES(?,?,?,?,?,1,?,?);";
		
	
		int n=update(sql, data.getCommunity_id(),data.getUsername(),password,phonenum,home_address,data.getPerson_num(),rand_id);
		Success success=new Success();
		com.raintea.bean.success.Data da=new com.raintea.bean.success.Data();
		
		if(n==0) {
			success.setErrCode("0000");
			success.setErrMsg("更新失败");
			success.setRetCode("0000");
			da.setSuccess(0);
		}else {
			success.setErrCode("0001");
			success.setErrMsg("更新成功");
			success.setRetCode("0000");
			da.setSuccess(1);
		}
		return success;
		
	}
	
	@Test
	public void tt() {
		set(1,1,1);
	}
	
	public String getHomeName(String sql,Object ...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return (String) queryRunner.query(connection, sql, new ScalarHandler(), args);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	
}
