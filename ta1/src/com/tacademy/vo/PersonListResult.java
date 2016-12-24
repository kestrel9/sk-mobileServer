package com.tacademy.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonListResult implements Serializable {


	
	private static final long serialVersionUID = -997175044876614451L;
	
	private int count;
	private String status;
	private ArrayList<Person> list;
	
	public ArrayList<Person> getList() {
		return list;
	}
	public void setList(ArrayList<Person> list) {
		this.list = list;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PersonListResult [list=" + list + ", count=" + count + ", status=" + status + "]";
	}
	
	
	
	

}
