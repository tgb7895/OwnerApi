
package com.raintea.bean.getmessagelist;
import java.util.List;


public class GetMessageList {

    private List<Data> data;
    private String errorCode;
    private String errorMsg;
    private String retCode;
    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

    public void setErrorCode(String errorCode) {
         this.errorCode = errorCode;
     }
     public String getErrorCode() {
         return errorCode;
     }

    public void setErrorMsg(String errorMsg) {
         this.errorMsg = errorMsg;
     }
     public String getErrorMsg() {
         return errorMsg;
     }

    public void setRetCode(String retCode) {
         this.retCode = retCode;
     }
     public String getRetCode() {
         return retCode;
     }

}