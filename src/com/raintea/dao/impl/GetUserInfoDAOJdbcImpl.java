package com.raintea.dao.impl;

import com.raintea.bean.getuserinfo.Data;
import com.raintea.bean.getuserinfo.GetUserInfo;
import com.raintea.dao.DAO;
import com.raintea.dao.GetUserInfoDAO;

public class GetUserInfoDAOJdbcImpl extends DAO<Data> implements GetUserInfoDAO{

	@Override
	public GetUserInfo getUser(int owner_id) {
		String sql="SELECT "
				+ "username owner_name,"
				+ "home_address,owner_type,"
				+ "community_name,"
				+ "community_addres community_address,"
				+ "build_number,unit_number,"
				+ "house_number,person_num,"
				+ "tenement_owner.`rand_id`,"
				+ "upic owner_pic "
				+ "FROM "
				+ "tenement_owner,"
				+ "tenement_community,"
				+ "tenement_community_house"
				+ " WHERE "
				+ "tenement_owner.`community_id`=tenement_community.`id`"
				+ " AND "
				+ "tenement_community_house.`rand_id`=tenement_owner.`rand_id`"
				+ " AND tenement_owner.`id`=?;";
		GetUserInfo gui=new GetUserInfo();

		Data data=get(sql, owner_id);
		if(data==null) {
			gui.setData(new Data());

			gui.setErrCode("0000");
			gui.setErrMsg("用户id不存在");
			gui.setRetCode("0000");
		}else {
			gui.setData(data);

			gui.setErrCode("0001");
			gui.setErrMsg("");
			gui.setRetCode("");
		}
		
		return gui;
	}
	

}
