package com.raintea.dao.impl;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.DAO;
import com.raintea.dao.toCommentDAO;
import com.raintea.db.JdbcUtils;

public class toCommentDAOJdbcImpl extends DAO<Success> implements toCommentDAO{

	@Override
	public Success setComment(int level, String repair_id, String content) {
	
		
		 DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		 
		String sqlco="select community_id from tenement_repair where order_number=?";
		
		String sqlow="select owner_id from tenement_repair where order_number=?";
		
		String sqltim="select repear_time from tenement_repair where order_number=?";
		Success sc=new Success();
		Data data=new Data();
		
		int co=0;
	
		int ow=0;

		String tim=null;
		try {
			co = getIntValue(sqlco, repair_id);
			ow = getIntValue(sqlow, repair_id);
			tim = sdf.format(getAddressValue(sqltim, repair_id));
		} catch (Exception e) {
			sc.setErrCode("0000");
			sc.setErrMsg("更新失败");
			sc.setRetCode("0000");
			data.setSuccess(0);
			sc.setData(data);
		}


		String sql="INSERT INTO "
				+ " tenement_repears_comment "
				+ "("
				+ "level,"
				+ "repear_id,"
				+ "content,"
				+ "comment_time,"
				+ "community_id,"
				+ "Owner_id) "
				+ "VALUES (?,?,?,?,?,?);";
		
		int n=update(sql, level,repair_id,content,tim,co,ow);
	
		
		if(n==0) {
			sc.setErrCode("0000");
			sc.setErrMsg("更新失败");
			sc.setRetCode("0000");
			data.setSuccess(0);
			sc.setData(data);
			
		}else {
			sc.setErrCode("0001");
			sc.setErrMsg("更新成功");
			sc.setRetCode("");
			data.setSuccess(1);
			sc.setData(data);
		}
		
		return sc;
	}
	
	
	/**
	 * 返回一个字段的值home_address
	 * 
	 */
	public Integer getIntValue(String sql,Object ...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return  (Integer) queryRunner.query(connection, sql, new ScalarHandler(), args);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	public Timestamp getAddressValue(String sql,Object ...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return  (Timestamp) queryRunner.query(connection, sql, new ScalarHandler(), args);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	
}
