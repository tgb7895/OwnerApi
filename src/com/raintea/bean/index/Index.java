/**
  * Copyright 2018 bejson.com 
  */
package com.raintea.bean.index;

/**
 * Auto-generated: 2018-03-26 21:55:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Index {

    private String retCode;
    private String errCode;
    private String errMsg;
    private Data data;
    public void setRetCode(String retCode) {
         this.retCode = retCode;
     }
     public String getRetCode() {
         return retCode;
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

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }
	@Override
	public String toString() {
		return "Index [retCode=" + retCode + ", errCode=" + errCode + ", errMsg=" + errMsg + ", data=" + data + "]";
	}
     
     

}