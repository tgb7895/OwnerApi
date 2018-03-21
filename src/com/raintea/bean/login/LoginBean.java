package com.raintea.bean.login;

public class LoginBean {
	private int owner_id;
	private String owner_name;
	private int owner_type;
	private String community_name;
	private String build_number;
	private String unit_number;
	private String house_number;
	private String rand_id;
	private String telephone;
	private int community_id;
	private int person_num;
	private String address;
	private String upic;
	
	public LoginBean() {
		owner_name="";
		community_name="";
		build_number="";
		unit_number="";
		house_number="";
		rand_id="";
		telephone="";
		address="";
		upic="";
		
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getOwner_type() {
		return owner_type;
	}

	public void setOwner_type(int owner_type) {
		this.owner_type = owner_type;
	}

	public String getCommunity_name() {
		return community_name;
	}

	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
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

	public String getRand_id() {
		return rand_id;
	}

	public void setRand_id(String rand_id) {
		this.rand_id = rand_id;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getCommunity_id() {
		return community_id;
	}

	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}

	public int getPerson_num() {
		return person_num;
	}

	public void setPerson_num(int person_num) {
		this.person_num = person_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUpic() {
		return upic;
	}

	public void setUpic(String upic) {
		this.upic = upic;
	}


	
	
	
}
