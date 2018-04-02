package com.raintea.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.DAO;
import com.raintea.dao.GiveOutTheNewsDAO;

public class GiveOutTheNewsDAOJdbcImpl extends DAO<Success> implements GiveOutTheNewsDAO{

	@Override
	public Success updateNews(String title, String content, int community_id) {


		String sql="INSERT "
				+ "into "
				+ "tenement_msg(title,content,trans_time,community_id) "
				+ "VALUES(?,?,?,?);";
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		int n=update(sql, title,content,df.format(new Date()),community_id);
		
		Success success=new Success();
		Data data=new Data();
		
		if(n==0) {
			success.setErrCode("0000");
			success.setErrMsg("≤Â»Î ß∞‹");
			success.setRetCode("0000");
			data.setSuccess(0);
			success.setData(data);
		}else {
			success.setErrCode("0001");
			success.setErrMsg("");
			success.setRetCode("");
			data.setSuccess(1);
			success.setData(data);
		}
		
		
		return success;
	}
	
	

}
