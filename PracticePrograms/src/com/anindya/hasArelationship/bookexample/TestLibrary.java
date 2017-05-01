package com.anindya.hasArelationship.bookexample;

public class TestLibrary {

	public static void main(String[] args) {
		
		Library lb = new Library("B03", 90);
		Book bk = new Book("Chetan Bhagat","ISBN90890","Half Girlfriend");
		lb.setBook(bk);
		lb.showDetails();
		lb.getBook().showDetails();
		lb.getBook().setBookTitle("Five Point Someone");
		System.out.println("The New Book of this Author is ");
		lb.getBook().showDetails();
	}

}
