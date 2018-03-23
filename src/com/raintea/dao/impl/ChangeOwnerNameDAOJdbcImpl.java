package com.raintea.dao.impl;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.ChangeOwnerNameDAO;
import com.raintea.dao.DAO;

public class ChangeOwnerNameDAOJdbcImpl extends DAO<Data> implements ChangeOwnerNameDAO{

	@Override
	public Success updateuser(int owner_id, String ownername) {
		String sql="UPDATE tenement_owner SET username=? WHERE id=?;";
		
		Success sc=new Success();
		Data data=new Data();
		
		int n=update(sql, ownername,owner_id);
		
		if(n==0) {
			sc.setErrCode("0000");
			sc.setErrMsg("更新用户名失败");
			sc.setRetCode("0000");
			data.setSuccess(0);
			sc.setData(data);
			
		}else {
			sc.setErrCode("0001");
			sc.setErrMsg("更新用户名成功");
			sc.setRetCode("");
			data.setSuccess(1);
			sc.setData(data);
		}
		
		return sc;
	}

	
	
}
