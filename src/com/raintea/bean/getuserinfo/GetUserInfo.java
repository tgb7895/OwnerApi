
package com.raintea.bean.getuserinfo;


public class GetUserInfo {

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

}