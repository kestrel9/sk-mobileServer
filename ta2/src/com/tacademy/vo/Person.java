package com.tacademy.vo;

import java.io.Serializable;

public class Person implements Serializable {
	

	private static final long serialVersionUID = 3428611166441462681L;
	private String name;
	private String address;
	private String age;
	private String tel;
	
	
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
}
