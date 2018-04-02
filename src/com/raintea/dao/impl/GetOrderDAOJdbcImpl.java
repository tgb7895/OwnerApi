package com.raintea.dao.impl;
import java.util.List;

import com.raintea.bean.getorder.Data;
import com.raintea.bean.getorder.GetOrder;
import com.raintea.bean.getorder.Worker;
import com.raintea.dao.DAO;
import com.raintea.dao.GetOrderDAO;
public class GetOrderDAOJdbcImpl extends DAO<Data> implements GetOrderDAO{

	@Override
	public GetOrder get(String owner_id) {
		GetOrder toolsTest=new GetOrder();
		
		String sql="SELECT "
				+ "tenement_repair.id repair_id,"
				+ "address address ,cause 'cause',"
				+ "appointment_time appointment_time,"
				+ "order_number repair_number,"
				+ "progress progress "
				+ "FROM"
				+ " tenement_repair,"
				+ "tenement_community_workperson "
				+ "WHERE tenement_repair.worker_id=tenement_community_workperson.id and owner_id=?";
		String imgsql="SELECT "
				+ "img_url "
				+ "FROM "
				+ "tenement_repears_comment,"
				+ "tenement_image "
				+ "WHERE "
				+ "tenement_repears_comment.`id`=tenement_image.`flag_id`  "
				+ "AND tenement_repears_comment.`Owner_id`=? "
				+ "AND tenement_image.`flag`=1;";
		
		Data data = super.get(sql, owner_id);
		GetOrderDAOJdbcImpl_z gddjiz = new GetOrderDAOJdbcImpl_z();
		try {	
			data.setWorker(gddjiz.getWorkerdata(owner_id));
			data.setImage(getStrList(imgsql, "img_url", owner_id));
			toolsTest.setData(data);
			toolsTest.setErrCode("0001");
			toolsTest.setErrMsg("");
			toolsTest.setRetCode("");
		} catch (Exception e) {
			toolsTest.setErrCode("0000");
			toolsTest.setErrMsg("id´íÎó");
			toolsTest.setRetCode("0000");
			toolsTest.setData(new Data());
			
			
			
		}
		
		
//		System.out.println(toolsTest);
//		GetOrderDAOJdbcImpl_z gddjiz=new GetOrderDAOJdbcImpl_z();
	
		//System.out.println(gddjiz.getWorkerdata("1"));
		
		return toolsTest;
	}
	
}
class GetOrderDAOJdbcImpl_z extends DAO<Worker>{
	
	public Worker getWorkerdata(String owner_id) {
		String sql="SELECT "
				+ "worker_id worker_id ,"
				+ "username worker_name,"
				+ "telephone worker_phone "
				+ "FROM"
				+ " tenement_repair,"
				+ "tenement_community_workperson "
				+ "WHERE tenement_repair.worker_id=tenement_community_workperson.id and owner_id=?";
		
		return get(sql,owner_id);
	}

}
