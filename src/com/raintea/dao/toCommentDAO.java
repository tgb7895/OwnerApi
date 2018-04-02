package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface toCommentDAO {
//	评价级别 level int 评价维修星级 不可控
//	订单id repair_id int 维修人员id 不可空
//	评价内容 content String 评价内容 不可空
	
	public Success setComment(int level,String repair_id,String content);
	
}
