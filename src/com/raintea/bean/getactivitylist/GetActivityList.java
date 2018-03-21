
package com.raintea.bean.getactivitylist;
import java.util.List;


public class GetActivityList {

    private String retCode;
    private String errCode;
    private String errMsg;
    private List<Data> data;
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

    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }
     
     

}