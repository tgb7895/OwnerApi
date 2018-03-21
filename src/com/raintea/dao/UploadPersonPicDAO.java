package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface UploadPersonPicDAO {

	public Success updatePic(int owner_id,String image);
	
}
