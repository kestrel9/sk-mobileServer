package com.tacademy.vo;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 5758376105545368603L;
	
	private String name;
	private int age;
	private String tel;
	private boolean sex;
	
	public Person(){
		
	}
	
	
	public Person(String name, int age, String tel, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", tel=" + tel + ", sex=" + sex + "]";
	}
	
	
	
	
	

}
