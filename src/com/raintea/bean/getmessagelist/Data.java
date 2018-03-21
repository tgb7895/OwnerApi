
package com.raintea.bean.getmessagelist;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class Data {

    private String content;
    private int msg_id;
    private String title;
    @JSONField(format="yyyy-MM-dd")
    private Date trans_time;
    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setMsg_id(int msg_id) {
         this.msg_id = msg_id;
     }
     public int getMsg_id() {
         return msg_id;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setTrans_time(Date trans_time) {
         this.trans_time = trans_time;
     }
     public Date getTrans_time() {
         return trans_time;
     }

}