package com.tacademy.sam.vo;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -9021363261256128274L;
	
	private String code;
	private String name;
	private int price;
	
	public Product() { }
	
	public Product(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
