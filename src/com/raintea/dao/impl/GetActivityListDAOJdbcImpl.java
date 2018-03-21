package com.raintea.dao.impl;

import java.util.List;

import com.raintea.bean.getactivitylist.Data;
import com.raintea.bean.getactivitylist.GetActivityList;
import com.raintea.dao.DAO;
import com.raintea.dao.GetActivityListDAO;

public class GetActivityListDAOJdbcImpl extends DAO<Data> implements GetActivityListDAO{

	@Override
	public GetActivityList get(int community_id, int owner_id) {
		String sql="SELECT activity_id,NAME title,content,pic,start_time,end_time,people_count,applied_count,isjoin(activity_id,?) isJoin FROM `tenement_activity`,`tenement_apply` WHERE `tenement_activity`.`id`=`tenement_apply`.`activity_id` AND `community_id`=?;";
		GetActivityList getActivityList=new GetActivityList();
		
		
		 List<Data> data=getForList(sql,owner_id,community_id);
		 
		
			getActivityList.setData(data);
			getActivityList.setErrCode("0001");
			getActivityList.setErrMsg("成功获取活动信息");
			getActivityList.setRetCode("");
			if(data.isEmpty()) {
				getActivityList.setErrCode("0000");
				getActivityList.setErrMsg("无法获取到");
				getActivityList.setRetCode("0000");
			}
		 
		return getActivityList;
	}

}
