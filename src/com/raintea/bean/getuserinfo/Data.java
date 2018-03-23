
package com.raintea.bean.getuserinfo;


public class Data {

    private String owner_name;
    private String home_address;
    private String community_name;
    private String community_address;
    private String build_number;
    private String unit_number;
    private String house_number;
    private int owner_type;
    private int person_num;
    private String rand_id;
    private String owner_pic;
    
    
    public Data() {
    	owner_name="";
    	home_address="";
    	community_name="";
    	community_address="";
    	build_number="";
    	unit_number="";
    	rand_id="";
    	owner_pic="";
	}
    
	public void setOwner_name(String owner_name) {
         this.owner_name = owner_name;
     }
     public String getOwner_name() {
         return owner_name;
     }

    public void setHome_address(String home_address) {
         this.home_address = home_address;
     }
     public String getHome_address() {
         return home_address;
     }

    public void setCommunity_name(String community_name) {
         this.community_name = community_name;
     }
     public String getCommunity_name() {
         return community_name;
     }

    public void setCommunity_address(String community_address) {
         this.community_address = community_address;
     }
     public String getCommunity_address() {
         return community_address;
     }

    public void setBuild_number(String build_number) {
         this.build_number = build_number;
     }
     public String getBuild_number() {
         return build_number;
     }

    public void setUnit_number(String unit_number) {
         this.unit_number = unit_number;
     }
     public String getUnit_number() {
         return unit_number;
     }

    public void setHouse_number(String house_number) {
         this.house_number = house_number;
     }
     public String getHouse_number() {
         return house_number;
     }

    public void setOwner_type(int owner_type) {
         this.owner_type = owner_type;
     }
     public int getOwner_type() {
         return owner_type;
     }

    public void setPerson_num(int person_num) {
         this.person_num = person_num;
     }
     public int getPerson_num() {
         return person_num;
     }

    public void setRand_id(String rand_id) {
         this.rand_id = rand_id;
     }
     public String getRand_id() {
         return rand_id;
     }

    public void setOwner_pic(String owner_pic) {
         this.owner_pic = owner_pic;
     }
     public String getOwner_pic() {
         return owner_pic;
     }

}