package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface GiveOutTheNewsDAO {

//	标题 title string 消息标题 不可空
//	内容 content string 消息内容 不可空
//	小区id community_id int 小区id 不可
	public Success updateNews(String title,String content,int community_id);
	
}
