package com.anindya.hasArelationship.bookexample;

public class Book {
	
	private String authorName;
	private String serialNumber;
	private String bookTitle;
	
	public Book(String authorName, String serialNumber, String bookTitle) {
		super();
		this.authorName = authorName;
		this.serialNumber = serialNumber;
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public void showDetails(){
		System.out.println("The Author Name is "+authorName);
		System.out.println("The Serial Number of the Book is "+serialNumber);
		System.out.println("The Book Title is "+bookTitle);
	}
	
	
	

}
