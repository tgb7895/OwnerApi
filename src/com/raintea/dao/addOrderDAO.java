package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface addOrderDAO {

//	户id owner_id int 用户id 不可空
//	小区id community_id int 小区id 不可空
//	小区报修部门id department_id int 小区报修部门id 不可空
//	预约时间 appointment_t
//	ime String 预约时间 不可空
//	报修图片 images array 报修图片 不可空
//	报修原因 case String 报修原因 不可空
	public Success addorders(int owner_id,int coummunity_id,int department_id
			, String appointment_time,String img,String cause);
	
}
