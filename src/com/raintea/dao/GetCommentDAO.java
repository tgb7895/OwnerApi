package com.raintea.dao;

import com.raintea.bean.getcomment.GetComment;

public interface GetCommentDAO {
	
	public GetComment get(int owner_id,int repair_id);
	
	
}
