package com.raintea.dao;

import com.raintea.bean.getmessagelist.GetMessageList;

public interface GetMessageListDAO {
	
	public GetMessageList get(int community_id,int owner_id);
	
}
