package org.tacademy.webdata.vo;

import java.io.Serializable;

public class Condition implements Serializable {
	
	private static final long serialVersionUID = -4083868488395668597L;

	String key;
	String category;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Condition [key=" + key + ", category=" + category + "]";
	}
	
	

}
