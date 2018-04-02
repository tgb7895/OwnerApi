/**
  * Copyright 2018 bejson.com 
  */
package com.raintea.bean.index;
import java.util.Date;

/**
 * Auto-generated: 2018-03-26 21:55:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Notice {

    private int notice_id;
    private String title;
    private String content;
    private int community_id;
    private Date trans_time;
    public void setNotice_id(int notice_id) {
         this.notice_id = notice_id;
     }
     public int getNotice_id() {
         return notice_id;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setCommunity_id(int community_id) {
         this.community_id = community_id;
     }
     public int getCommunity_id() {
         return community_id;
     }

    public void setTrans_time(Date trans_time) {
         this.trans_time = trans_time;
     }
     public Date getTrans_time() {
         return trans_time;
     }
	@Override
	public String toString() {
		return "Notice [notice_id=" + notice_id + ", title=" + title + ", content=" + content + ", community_id="
				+ community_id + ", trans_time=" + trans_time + "]";
	}
     

}