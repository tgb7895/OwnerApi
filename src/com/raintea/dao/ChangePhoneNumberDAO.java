package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface ChangePhoneNumberDAO {
//	���ֻ��� phonenum String ���ֻ��� �ǿ�
//	ҵ��id owner_id int ҵ��id �ǿ�
	public Success getsuc(String phonenum,int owner_id);
	
}
