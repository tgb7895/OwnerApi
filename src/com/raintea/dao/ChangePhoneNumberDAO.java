package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface ChangePhoneNumberDAO {
//	新手机号 phonenum String 新手机号 非空
//	业主id owner_id int 业主id 非空
	public Success getsuc(String phonenum,int owner_id);
	
}
