package com.raintea.dao.impl;
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
				+ "upic image," //”–Œ Ã‚
				+ "progress progress "
				+ "FROM"
				+ " tenement_repair,"
				+ "tenement_community_workperson "
				+ "WHERE tenement_repair.worker_id=tenement_community_workperson.id and owner_id=?";
		
		Data data=super.get(sql,owner_id);
		GetOrderDAOJdbcImpl_z gddjiz=new GetOrderDAOJdbcImpl_z();
		data.setWorker(gddjiz.getWorkerdata(owner_id));
		
		toolsTest.setData(data);
		toolsTest.setErrCode("0001");
		toolsTest.setErrMsg("");
		toolsTest.setRetCode("");
		
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
