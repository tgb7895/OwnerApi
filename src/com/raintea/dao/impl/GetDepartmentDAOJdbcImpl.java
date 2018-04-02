package com.raintea.dao.impl;

import java.util.List;

import com.raintea.bean.getdepartment.Data;
import com.raintea.bean.getdepartment.GetDepartment;
import com.raintea.bean.getdepartment.ListDep;
import com.raintea.dao.DAO;
import com.raintea.dao.GetDepartmentDAO;

public class GetDepartmentDAOJdbcImpl extends DAO<ListDep> implements GetDepartmentDAO{

	@Override
	public GetDepartment getList(int community_id) {
		
		String sql="SELECT"
				+ " id department_id,"
				+ "section_name department_name "
				+ "FROM "
				+ "tenement_section_type "
				+ "WHERE community_id=?;";
		
		List<ListDep> list=getForList(sql, community_id);
		
		GetDepartment gd=new GetDepartment();
		Data data=new Data();
		data.setList(list);
		
		if(list==null) {
			gd.setErrCode("0000");
			gd.setErrMsg("部门找不到");
			gd.setRetCode("0000");
		}else {
			gd.setErrCode("0001");
			gd.setErrMsg("");
			gd.setRetCode("");
			gd.setData(data);
		}
		
		return gd;
		
	}
	
	

}
