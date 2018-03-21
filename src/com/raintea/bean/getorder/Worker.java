
package com.raintea.bean.getorder;


public class Worker {

    private int worker_id;
    private String worker_name;
    private String worker_phone;
    public void setWorker_id(int worker_id) {
         this.worker_id = worker_id;
     }
     public int getWorker_id() {
         return worker_id;
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
	@Override
	public String toString() {
		return "Worker [worker_id=" + worker_id + ", worker_name=" + worker_name + ", worker_phone=" + worker_phone
				+ "]";
	}
     
     

}