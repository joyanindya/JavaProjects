package com.anindya.hasArelationship.bookexample;

import java.util.Scanner;

public class TestLibraryByArrayOfBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LibraryByArrayOfBooks lbk = new LibraryByArrayOfBooks();
		Book[] books = new Book[2];
		for(int i = 0 ; i<2; i++){
			System.out.println("Enter Author Name");
			String author =sc.next();
			System.out.println("Enter Serial Number ");
			String srl =sc.next();
			System.out.println("Enter Title Name");
			String tlt =sc.next();
			books[i] =new Book(author,srl,tlt);
			
		}
		
		lbk.setBooks(books);
		Book[] get_books = lbk.getBooks();
		for (int i = 0; i<get_books.length; i++){
			get_books[i].showDetails();
		}
		
		
				
	}

}
 