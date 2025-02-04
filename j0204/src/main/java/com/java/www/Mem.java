package com.java.www;

public class Mem {
	
	private String id;
	private String name;
	private String hobbies;
	
	public Mem() {}
	public Mem(String id,String name, String hobbies) {
		this.setId(id);
		this.setName(name);
		this.setHobbies(hobbies);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
}
