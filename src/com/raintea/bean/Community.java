package com.raintea.bean;

public class Community {
	private int id;
	private String community_name;
	private String community_addres;
	
	public Community() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommunity_name() {
		return community_name;
	}
	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}
	public String getCommunity_addres() {
		return community_addres;
	}
	public void setCommunity_addres(String community_addres) {
		this.community_addres = community_addres;
	}
	@Override
	public String toString() {
		return "Community [id=" + id + ", community_name=" + community_name + ", community_addres=" + community_addres
				+ "]";
	}
	
}
