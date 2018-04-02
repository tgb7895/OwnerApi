package com.raintea.dao.impl;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.ChangePasswordDAO;
import com.raintea.dao.DAO;

public class ChangePasswordDAOJdbcImpl extends DAO<Data> implements ChangePasswordDAO{

	@Override
	public Success updatePassword(int owner_id, String password) {
		
		String sql="UPDATE tenement_owner SET password=? WHERE id=?;";
		
		Success sc=new Success();
		Data data=new Data();
		
		int n=update(sql,password,owner_id);
		
		if(n==0) {
			sc.setErrCode("0000");
			sc.setErrMsg("更新密码失败");
			sc.setRetCode("0000");
			data.setSuccess(0);
			sc.setData(data);
			
		}else {
			sc.setErrCode("0001");
			sc.setErrMsg("更新密码成功");
			sc.setRetCode("");
			data.setSuccess(1);
			sc.setData(data);
		}
		return sc;
	}

}
