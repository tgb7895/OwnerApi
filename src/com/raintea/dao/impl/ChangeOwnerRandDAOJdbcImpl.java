package com.raintea.dao.impl;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.ChangeOwnerRandDAO;
import com.raintea.dao.DAO;

public class ChangeOwnerRandDAOJdbcImpl extends DAO<Data> implements ChangeOwnerRandDAO{

	@Override
	public Success updatehome(String phone, String rand_id) {
		
		String sql="UPDATE tenement_owner SET rand_id=? WHERE telephone=?;";
		
		Success sc=new Success();
		Data data=new Data();
		
		int n=update(sql,  rand_id,phone);
		
		if(n==0) {
			sc.setErrCode("0000");
			sc.setErrMsg("���·�����Կʧ��");
			sc.setRetCode("0000");
			data.setSuccess(0);
			sc.setData(data);
			
		}else {
			sc.setErrCode("0001");
			sc.setErrMsg("���·�����Կ�ɹ�");
			sc.setRetCode("");
			data.setSuccess(1);
			sc.setData(data);
		}
		
		return sc;
	}
	
	
	

	
	
	
}
