package com.raintea.dao.impl;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.ChangePhoneNumberDAO;
import com.raintea.dao.DAO;

public class ChangePhoneNumberDAOJdbcImpl extends DAO<Data> implements ChangePhoneNumberDAO{

	@Override
	public Success getsuc(String phonenum, int owner_id) {
		String sql="UPDATE tenement_owner SET telephone=? WHERE id=?;";
		
		int n=update(sql, phonenum,owner_id);
		
		Success success=new Success();
		Data data=new Data();
		
		
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
