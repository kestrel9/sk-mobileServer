/**
 * 
 */
package com.tacademy.board.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class BoardListResult implements Serializable {

	private static final long serialVersionUID = -930409911585563200L;
	
	private int count;
	private String status;
	private ArrayList<Board> list;
	
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
	public ArrayList<Board> getList() {
		return list;
	}
	public void setList(ArrayList<Board> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "BoardListResult [count=" + count + ", status=" + status + ", list=" + list + "]";
	}
	
	 
}
