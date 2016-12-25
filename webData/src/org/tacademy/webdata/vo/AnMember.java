package org.tacademy.webdata.vo;

import java.io.Serializable;

public class AnMember implements Serializable {

	private static final long serialVersionUID = -4787049265031683067L;
	private static final String FAIL = "fail";
	private String name;
	private String id;
	private String pw;
	private String tel;
	private String address;
	private String comment;
	private String status = FAIL;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AnMember [name=" + name + ", id=" + id + ", pw=" + pw + ", tel=" + tel + ", address=" + address
				+ ", comment=" + comment + ", status=" + status + "]";
	}
	
	
}

