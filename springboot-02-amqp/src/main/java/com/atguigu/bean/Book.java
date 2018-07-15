package com.atguigu.bean;

import java.io.Serializable;

public class Book implements Serializable {
	private String bookName;
	private String authName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authName=" + authName + "]";
	}
	public Book(String bookName, String authName) {
		super();
		this.bookName = bookName;
		this.authName = authName;
	}
	public Book() {
		super();
	}
}
