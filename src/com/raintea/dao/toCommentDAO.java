package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface toCommentDAO {
//	���ۼ��� level int ����ά���Ǽ� ���ɿ�
//	����id repair_id int ά����Աid ���ɿ�
//	�������� content String �������� ���ɿ�
	
	public Success setComment(int level,String repair_id,String content);
	
}
