package com.raintea.dao.impl;

import java.util.List;

import com.raintea.bean.getmessagelist.*;
import com.raintea.dao.DAO;
import com.raintea.dao.GetMessageListDAO;
public class GetMessageListDAOJdbcImpl extends DAO<Data> implements GetMessageListDAO{

	@Override
	public GetMessageList get(int community_id, int owner_id) {
		
		String sql="SELECT id msg_id,title,content,trans_time,community_id FROM tenement_msg WHERE community_id=?;";
		
		GetMessageList getMessageList=new GetMessageList();
		getMessageList.setData(getForList(sql, community_id));
		if(getMessageList.getData()==null) {
			getMessageList.setErrorCode("0000");
			getMessageList.setErrorMsg("小区编号不存在");
			getMessageList.setRetCode("0000");
		}else {
			getMessageList.setErrorCode("0001");
			getMessageList.setErrorMsg("");
			getMessageList.setRetCode("");
			
		}
		
		return getMessageList;
	}

	
	
	
}
