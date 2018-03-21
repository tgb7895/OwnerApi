
package com.raintea.bean.getcomment;
import java.util.List;


public class Data {

    private int order_id;
    private String order_number;
    private String address;
    private String cause;
    private String content;
    private int level;
    private String comment_time;
    private String repair_time;
    private String owner_name;
    private String community_name;
    private String home_address;
    private List<String> image;
    public void setOrder_id(int order_id) {
         this.order_id = order_id;
     }
     public int getOrder_id() {
         return order_id;
     }

    public void setOrder_number(String order_number) {
         this.order_number = order_number;
     }
     public String getOrder_number() {
         return order_number;
     }

    public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setCause(String cause) {
         this.cause = cause;
     }
     public String getCause() {
         return cause;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setLevel(int level) {
         this.level = level;
     }
     public int getLevel() {
         return level;
     }

    public void setComment_time(String comment_time) {
         this.comment_time = comment_time;
     }
     public String getComment_time() {
         return comment_time;
     }

    public void setRepair_time(String repair_time) {
         this.repair_time = repair_time;
     }
     public String getRepair_time() {
         return repair_time;
     }

    public void setOwner_name(String owner_name) {
         this.owner_name = owner_name;
     }
     public String getOwner_name() {
         return owner_name;
     }

    public void setCommunity_name(String community_name) {
         this.community_name = community_name;
     }
     public String getCommunity_name() {
         return community_name;
     }

    public void setHome_address(String home_address) {
         this.home_address = home_address;
     }
     public String getHome_address() {
         return home_address;
     }

    public void setImage(List<String> image) {
         this.image = image;
     }
     public List<String> getImage() {
         return image;
     }
	@Override
	public String toString() {
		return "Data [order_id=" + order_id + ", order_number=" + order_number + ", address=" + address + ", cause="
				+ cause + ", content=" + content + ", level=" + level + ", comment_time=" + comment_time
				+ ", repair_time=" + repair_time + ", owner_name=" + owner_name + ", community_name=" + community_name
				+ ", home_address=" + home_address + ", image=" + image + "]";
	}
     
     

}