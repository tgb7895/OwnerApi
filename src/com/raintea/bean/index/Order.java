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
public class Order {

    private int order_id;
    private String worker_name;
    private String worker_phone;
    private Date receive_order_time;
    public void setOrder_id(int order_id) {
         this.order_id = order_id;
     }
     public int getOrder_id() {
         return order_id;
     }

    public void setWorker_name(String worker_name) {
         this.worker_name = worker_name;
     }
     public String getWorker_name() {
         return worker_name;
     }

    public void setWorker_phone(String worker_phone) {
         this.worker_phone = worker_phone;
     }
     public String getWorker_phone() {
         return worker_phone;
     }

    public void setReceive_order_time(Date receive_order_time) {
         this.receive_order_time = receive_order_time;
     }
     public Date getReceive_order_time() {
         return receive_order_time;
     }
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", worker_name=" + worker_name + ", worker_phone=" + worker_phone
				+ ", receive_order_time=" + receive_order_time + "]";
	}
     
     

}