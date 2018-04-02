package com.raintea.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.raintea.bean.getcompletedorderlist.Data;
import com.raintea.bean.getcompletedorderlist.GetCompletedOrderList;
import com.raintea.dao.DAO;
import com.raintea.dao.GetCompletedOrderListDAO;

public class GetCompletedOrderListDAOJdbcImpl extends DAO<Data> implements GetCompletedOrderListDAO{

	@Override
	public GetCompletedOrderList getList(int owner_id) {
		String sql="SELECT tenement_repair.id repair_id,"
				+ "tenement_repair.community_id,"
				+ "worker_id,"
				+ "username owner_name,"
				+ "telephone owner_phone,"
				+ "order_number repair_number,"
				+ "cause,"
				+ "address,"
				+ "repear_time,"
				+ "appointment_time,"
				+ "receive_order_time,"
				+ "complete_time,"
				+ "("
				+ "SELECT COUNT(*) FROM"
				+ " tenement_repears_comment,"
				+ "tenement_repair"
				+ " WHERE tenement_repears_comment.repear_id=tenement_repair.`id` "
				+ "AND tenement_repair.`owner_id`=?"
				+ ") isComment "
				+ "FROM tenement_repair,"
				+ "tenement_owner"
				+ " WHERE tenement_repair.`owner_id`=tenement_owner.`id`"
				+ " AND tenement_repair.owner_id=?;";
		GetCompletedOrderList gcol=new GetCompletedOrderList();
		List<Data> data=getForList(sql,owner_id,owner_id);
		if(data.isEmpty()) {
			gcol.setErrCode("0000");
			gcol.setErrMsg("”√ªßid¥ÌŒÛ");
			gcol.setRetCode("0000");
			gcol.setData(new ArrayList<Data>());
			
		}else {
			
			gcol.setData(data);
			gcol.setErrCode("0001");
			gcol.setErrMsg("");
			gcol.setRetCode("");
		}
		
		return gcol;
	}

	
	
}
