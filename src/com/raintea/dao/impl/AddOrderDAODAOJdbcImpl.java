package com.raintea.dao.impl;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.raintea.bean.addorder.AddOrder;
import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.DAO;
import com.raintea.dao.addOrderDAO;
import com.raintea.db.JdbcUtils;

public class AddOrderDAODAOJdbcImpl extends DAO<AddOrder> implements addOrderDAO{

	@Override
	public Success addorders(
			int owner_id, int coummunity_id,
			int department_id, String appointment_time, String img,
			String cause) {
		String sqlAdress="select home_address from tenement_owner where id=?;";
		
		
		
		
		String sql="INSERT INTO "
				+ "tenement_repair "
				+ "("
				+ "community_id,"
				+ "is_worker,"
				+ "owner_id,"
				+ "order_number,"
				+ "address,"
				+ "cause,"
				+ "repear_time,"
				+ "appointment_time,"
				+ "department_id,"
				+ "progress)"
				+ " VALUES (?,0,?,?,?,?,?,?,?,1);";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		int re=update(sql, 
				coummunity_id,
				owner_id,
				getOrderIdByTime(),
				getAddressValue(sqlAdress,owner_id),
				cause,
				sdf.format(new Date()),
				appointment_time,
				department_id);
		

		String sqlImg="INSERT INTO "
				+ "tenement_image "
				+ "("
				+ "img_url,"
				+ "flag_id,"
				+ "flag)"
				+ " VALUES (?,?,1);";
		
		int imgg=update(sqlImg,img,owner_id);
		
		Success success=new Success();
		Data data=new Data();
		
		if(re==0&&imgg==0) {
			success.setErrCode("0000");
			success.setErrMsg("更新失败");
			success.setRetCode("0000");
			data.setSuccess(0);
		}else {
			success.setErrCode("0001");
			success.setErrMsg("更新成功");
			success.setRetCode("0000");
			data.setSuccess(1);
		}
		return success;
	}
	
	public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return newDate+result;
    }
	
	/**
	 * 返回一个字段的值home_address
	 * 
	 */
	public String getAddressValue(String sql,Object ...args) {
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
