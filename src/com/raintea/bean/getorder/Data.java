
package com.raintea.bean.getorder;
import java.util.Date;
import java.util.List;
public class Data {

    private int repair_id;
    private int progress;
    private String repair_number;
    private Date appointment_time;
    private String cause;
    private String address;
    private Worker worker;
    private List<String> image;
    
    
	public Data() {
		repair_number="";
		cause="";
		address="";
		
		
	}
	public int getRepair_id() {
		return repair_id;
	}
	public void setRepair_id(int repair_id) {
		this.repair_id = repair_id;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public String getRepair_number() {
		return repair_number;
	}
	public void setRepair_number(String repair_number) {
		this.repair_number = repair_number;
	}
	public Date getAppointment_time() {
		return appointment_time;
	}
	public void setAppointment_time(Date appointment_time) {
		this.appointment_time = appointment_time;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public List<String> getImage() {
		return image;
	}
	public void setImage(List<String> image) {
		this.image = image;
	}
    
    
    
    
     
}