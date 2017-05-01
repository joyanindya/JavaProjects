package com.anindya.hasArelationship.bookexample;

public class Library {
	
	private String shelfNumber;
	private int columnNumber;
	private Book book;
	
	public String getShelfNumber() {
		return shelfNumber;
	}
	public void setShelfNumber(String shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	public int getColumnNumber() {
		return columnNumber;
	}
	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Library(String shelfNumber, int columnNumber) {
		super();
		this.shelfNumber = shelfNumber;
		this.columnNumber = columnNumber;
	}
	
	public void showDetails(){
		System.out.println("The Self Number is "+shelfNumber);
		System.out.println("The Column Number is  "+columnNumber);

}
}
