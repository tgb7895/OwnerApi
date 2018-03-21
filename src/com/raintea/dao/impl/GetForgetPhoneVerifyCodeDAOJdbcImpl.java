package com.raintea.dao.impl;

import com.raintea.bean.getforgetphoneverifycode.Data;
import com.raintea.bean.getforgetphoneverifycode.GetForgetPhoneVerifyCode;
import com.raintea.dao.DAO;
import com.raintea.dao.GetForgetPhoneVerifyCodeDAO;

public class GetForgetPhoneVerifyCodeDAOJdbcImpl extends DAO<Data> implements GetForgetPhoneVerifyCodeDAO{

	@Override
	public GetForgetPhoneVerifyCode get(String phonenum) {
		
		String sql="SELECT id FROM tenement_owner WHERE telephone=?;";
		
		GetForgetPhoneVerifyCode getForgetPhoneVerifyCode=new GetForgetPhoneVerifyCode();
		Data data=get(sql, phonenum);
		getForgetPhoneVerifyCode.setData(data);
		if(getForgetPhoneVerifyCode.getData()==null) {
			getForgetPhoneVerifyCode.setErrCode("0000");
			getForgetPhoneVerifyCode.setErrMsg("ÎÞÊÖ»úºÅ");
			getForgetPhoneVerifyCode.setRetCode("0000");
			getForgetPhoneVerifyCode.setData(new Data());		
		}else {
			getForgetPhoneVerifyCode.setErrCode("0001");
			getForgetPhoneVerifyCode.setErrMsg("");
			getForgetPhoneVerifyCode.setRetCode("");
			data.setSuccess(1);
			
		}
		return getForgetPhoneVerifyCode;
	}
	
	
}
