package com.yedam.vo;

public class Book {
	// field
	private int id;
	private String title;
	private String author;
	private int price;
	
	// method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// 부모클래스(object)의 toString()를 자식이 물려받음.		-교수님 필기-
	// 부모클래스의 메서드를 자식클래스에서 재정의하는 것 = override.		-교수님 필기-
	@Override		
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public String toStr() {		//toStr = book이라는 class가 가지고있는 method
		return "id: " + id + ", title: " + title + ", author: " + author + ", price : " + price;
	}
	
	
}