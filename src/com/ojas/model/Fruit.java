package com.ojas.model;
public class Fruit {
	private String name;
	private String address;
    private String email;
    private String fruitid;
	private String fruitname;
	private String brouncher;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFruitid() {
		return fruitid;
	}
	public void setFruitid(String fruitid) {
		this.fruitid = fruitid;
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getBrouncher() {
		return brouncher;
	}
	public void setBrouncher(String brouncher) {
		this.brouncher = brouncher;
	}
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, String address, String email, String fruitid, String fruitname, String brouncher) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.fruitid = fruitid;
		this.fruitname = fruitname;
		this.brouncher = brouncher;
	}
	
}
