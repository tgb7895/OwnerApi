package com.raintea.dao;

import com.raintea.bean.getactivitylist.GetActivityList;

public interface GetActivityListDAO {
	public GetActivityList get(int community_id,int owner_id);
	
}
