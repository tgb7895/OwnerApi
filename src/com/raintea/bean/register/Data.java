package com.raintea.bean.register;

public class Data {

	private int community_id;
	private String username;
	private String build_number;
	private String unit_number;
	private String house_number;
	private int person_num;
	public int getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBuild_number() {
		return build_number;
	}
	public void setBuild_number(String build_number) {
		this.build_number = build_number;
	}
	public String getUnit_number() {
		return unit_number;
	}
	public void setUnit_number(String unit_number) {
		this.unit_number = unit_number;
	}
	public String getHouse_number() {
		return house_number;
	}
	public void setHouse_number(String house_number) {
		this.house_number = house_number;
	}
	public int getPerson_num() {
		return person_num;
	}
	public void setPerson_num(int person_num) {
		this.person_num = person_num;
	}
	@Override
	public String toString() {
		return "Data [community_id=" + community_id + ", username=" + username + ", build_number=" + build_number
				+ ", unit_number=" + unit_number + ", house_number=" + house_number + ", person_num=" + person_num
				+ "]";
	}
	
	
	
	
}
