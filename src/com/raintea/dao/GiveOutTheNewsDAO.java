package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface GiveOutTheNewsDAO {

//	���� title string ��Ϣ���� ���ɿ�
//	���� content string ��Ϣ���� ���ɿ�
//	С��id community_id int С��id ����
	public Success updateNews(String title,String content,int community_id);
	
}
