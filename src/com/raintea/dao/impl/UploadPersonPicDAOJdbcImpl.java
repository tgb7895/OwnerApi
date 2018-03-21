package com.raintea.dao.impl;

import com.raintea.bean.success.Data;
import com.raintea.bean.success.Success;
import com.raintea.dao.DAO;
import com.raintea.dao.UploadPersonPicDAO;

public class UploadPersonPicDAOJdbcImpl extends DAO<Data> implements  UploadPersonPicDAO{

	@Override
	public Success updatePic(int owner_id, String image) {
		
		String sql="UPDATE tenement_owner SET upic=? WHERE id=?;";
		
		Success sc=new Success();
		Data data=new Data();
		
		int n=update(sql, image,owner_id);
		if(n==0) {
			sc.setErrCode("0000");
			sc.setErrMsg("更新图片失败");
			sc.setRetCode("0000");
			data.setSuccess(0);
			sc.setData(data);
			
		}else {
			sc.setErrCode("0001");
			sc.setErrMsg("更新图片成功");
			sc.setRetCode("");
			data.setSuccess(1);
			sc.setData(data);
		}
		
		return sc;
	}
	

}
