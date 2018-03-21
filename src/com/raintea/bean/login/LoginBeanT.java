package com.raintea.bean.login;

import com.alibaba.fastjson.annotation.JSONField;

public class LoginBeanT {
	private String errCode;
    private String errMsg;
    private String retCode;
    private LoginBean loginbean;
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getRetCode() {
		return retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	@JSONField(name="data")
	public LoginBean getLoginbean() {
		return loginbean;
	}
	@JSONField(name="data")
	public void setLoginbean(LoginBean loginbean) {
		this.loginbean = loginbean;
	}
    
    
	   
}
