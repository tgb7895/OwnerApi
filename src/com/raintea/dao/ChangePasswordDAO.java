package com.raintea.dao;

import com.raintea.bean.success.Success;

public interface ChangePasswordDAO {
	public Success updatePassword(int owner_id,int password);
}
