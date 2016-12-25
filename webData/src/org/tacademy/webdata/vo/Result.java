package org.tacademy.webdata.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class Result implements Serializable {
	
	private static final long serialVersionUID = 1465173524994693250L;
	
	private String status;
	private int count;
	private ArrayList<Product> pList;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArrayList<Product> getpList() {
		return pList;
	}
	public void setpList(ArrayList<Product> pList) {
		this.pList = pList;
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", count=" + count + ", pList=" + pList + "]";
	}
	

}
