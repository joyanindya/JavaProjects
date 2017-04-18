package com.anindya.array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int numberOfElements , total = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number of Elements in the Array ");

		numberOfElements = sc.nextInt();

		int arr [] = new int[numberOfElements];

		System.out.println("Enter The Elements in the Array ");

		for(int i=0 ;i<numberOfElements;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0 ;i<numberOfElements;i++){
		    total += arr[i];
		}
		
		System.out.println("The Sum Of Array Elements: "+ total);
	}

}
