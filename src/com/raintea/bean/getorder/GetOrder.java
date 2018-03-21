/**
  * Copyright 2018 bejson.com 
  */
package com.raintea.bean.getorder;

public class GetOrder {

    private Data data;
    private String errCode;
    private String errMsg;
    private String retCode;
    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

    public void setErrCode(String errCode) {
         this.errCode = errCode;
     }
     public String getErrCode() {
         return errCode;
     }

    public void setErrMsg(String errMsg) {
         this.errMsg = errMsg;
     }
     public String getErrMsg() {
         return errMsg;
     }

    public void setRetCode(String retCode) {
         this.retCode = retCode;
     }
     public String getRetCode() {
         return retCode;
     }
	@Override
	public String toString() {
		return "GetOrder [data=" + data + ", errCode=" + errCode + ", errMsg=" + errMsg + ", retCode=" + retCode + "]";
	}
     
     

}