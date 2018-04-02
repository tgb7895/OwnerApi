/**
  * Copyright 2018 bejson.com 
  */
package com.raintea.bean.index;
import java.util.List;

/**
 * Auto-generated: 2018-03-26 21:55:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private List<Banner> banner;
    private List<Order> order;
    private int message_num;
    private Notice notice;
    public void setBanner(List<Banner> banner) {
         this.banner = banner;
     }
     public List<Banner> getBanner() {
         return banner;
     }

    public void setOrder(List<Order> order) {
         this.order = order;
     }
     public List<Order> getOrder() {
         return order;
     }

    public void setMessage_num(int message_num) {
         this.message_num = message_num;
     }
     public int getMessage_num() {
         return message_num;
     }

    public void setNotice(Notice notice) {
         this.notice = notice;
     }
     public Notice getNotice() {
         return notice;
     }
	@Override
	public String toString() {
		return "Data [banner=" + banner + ", order=" + order + ", message_num=" + message_num + ", notice=" + notice
				+ "]";
	}

     
}