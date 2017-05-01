package com.anindya.array;

import java.util.Scanner;

public class FindSmallestNumberOfArray {

	public static void main(String[] args) {
		int numberOfElements , minValue;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number of Elements in the Array ");

		numberOfElements = sc.nextInt();

		int arr [] = new int[numberOfElements];

		System.out.println("Enter The Elements in the Array ");

		for(int i=0 ;i<numberOfElements;i++){
			arr[i]=sc.nextInt();
		}
		minValue = arr[0];
		for (int i=0;i<numberOfElements;i++){
			if(minValue>arr[i]){
				minValue = arr[i];
			}
		}
		System.out.println("Maximum Value :"+minValue);

		sc.close();
	}

}
