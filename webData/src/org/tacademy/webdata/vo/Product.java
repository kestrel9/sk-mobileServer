package org.tacademy.webdata.vo;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1341050970403508717L;
	
	private String title;
	private String count;
	private int price;
	private String image;
	private String category;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", count=" + count + ", price=" + price + ", image=" + image + ", category="
				+ category + "]";
	}
	
	


}
