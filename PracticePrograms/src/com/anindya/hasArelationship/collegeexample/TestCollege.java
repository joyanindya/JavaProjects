package com.anindya.hasArelationship.collegeexample;

import java.util.Scanner;

import com.anindya.hasArelationship.bookexample.Book;

public class TestCollege {

	public static void main(String[] args) {
		
		
		
		Collage cl = new Collage();
		Student[] students =new Student[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<2; i++){
			students[i] = new Student();
			System.out.println("Enter student Name");
			String name =sc.next();
			System.out.println("Enter ID Number ");
			String id =sc.next();
			students[i].setId(id);
			students[i].setName(name);
            
		}
		cl.setStudent(students);
		
		System.out.println("Enter The Id you Want to Search");
		
		String id = sc.next();
		
		System.out.println(cl.findStudentName(id));
		
		

	}

}
