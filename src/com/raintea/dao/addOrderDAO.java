package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface addOrderDAO {

//	��id owner_id int �û�id ���ɿ�
//	С��id community_id int С��id ���ɿ�
//	С�����޲���id department_id int С�����޲���id ���ɿ�
//	ԤԼʱ�� appointment_t
//	ime String ԤԼʱ�� ���ɿ�
//	����ͼƬ images array ����ͼƬ ���ɿ�
//	����ԭ�� case String ����ԭ�� ���ɿ�
	public Success addorders(int owner_id,int coummunity_id,int department_id
			, String appointment_time,String img,String cause);
	
}
