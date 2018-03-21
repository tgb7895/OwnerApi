package com.raintea.dao.impl;

import com.raintea.dao.DAO;
import com.raintea.dao.GetCommentDAO;
import com.raintea.bean.getcomment.*;



public class GetCommentDAOJdbcImpl extends DAO<Data> implements GetCommentDAO{

	@Override
	public GetComment get(int owner_id, int repair_id) {
		String sql="SELECT "
				+ "tenement_repair.owner_id order_id,"
				+ "order_number,address,"
				+ "cause,content,"
				+ "comment_time,"
				+ "repear_time repair_time,"
				+ "username owner_name,"
				+ "community_name,home_address "
				+ "FROM tenement_repears_comment,"
				+ "tenement_repair,tenement_owner,"
				+ "tenement_community "
				+ "WHERE"
				+ " tenement_repair.owner_id=tenement_repears_comment.Owner_id"
				+ " AND tenement_owner.`id`=tenement_repair.owner_id "
				+ "AND tenement_community.`id`=tenement_owner.`community_id`"
				+ "and tenement_repears_comment.`repear_id`=? and tenement_repair.owner_id=?;";
		GetComment getcomment=new GetComment();
		getcomment.setData(get(sql,owner_id,repair_id));
		if(getcomment.getData()==null) {
			getcomment.setErrCode("0000");
			getcomment.setErrMsg("id´íÎó");
			getcomment.setRetCode("");
		}
		getcomment.setErrCode("0001");
		getcomment.setErrMsg("");
		getcomment.setRetCode("");
		return getcomment;
	}
	
	
}
