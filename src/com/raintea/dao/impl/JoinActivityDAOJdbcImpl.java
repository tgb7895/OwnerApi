package com.raintea.dao.impl;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.DAO;
import com.raintea.dao.JoinActivityDAO;

public class JoinActivityDAOJdbcImpl extends DAO<Data> implements JoinActivityDAO{

	@Override
	public Success getSuc(int activity_id, int join_num, String join_content, int owner_id) {
		String sql="INSERT into "
				+ "tenement_apply(activity_id,join_count,join_content,user_id) "
				+ "VALUES(?,?,?,?);";
		
		int n=update(sql, activity_id,join_num,join_content,owner_id);
		
		Data data=new Data();
		Success success=new Success();
		
		if(n==0) {
			success.setErrCode("0000");
			success.setErrMsg("¸üÐÂÊ§°Ü");
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
