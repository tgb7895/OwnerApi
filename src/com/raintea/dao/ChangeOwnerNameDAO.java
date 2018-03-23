package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface ChangeOwnerNameDAO {

	
	public Success updateuser(int owner_id,String ownername);
	
}
