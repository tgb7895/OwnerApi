package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface JoinActivityDAO {

	
	public Success getSuc(int activity_id,int join_num,String join_content,int owner_id);
}
