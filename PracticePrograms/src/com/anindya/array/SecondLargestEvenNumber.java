package com.anindya.array;

import java.util.Scanner;

public class SecondLargestEvenNumber {

	public static void main(String[] args) {
		int numberOfElements , maxValue ,secondLargest;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number of Elements in the Array ");

		numberOfElements = sc.nextInt();

		int arr [] = new int[numberOfElements];

		System.out.println("Enter The Elements in the Array ");

		for(int i=0 ;i<numberOfElements;i++){
			System.out.println("Enter the "+(i+1)+" value");
			arr[i]=sc.nextInt();
		}
		maxValue = arr[0];
		secondLargest =arr[1];
		for (int i=0;i<numberOfElements;i++){
			if (arr[i]%2 != 0)
				continue;
			if (arr[i] > maxValue) {
				secondLargest = maxValue;
				maxValue = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest Even Value :"+secondLargest);

		sc.close();

	}

}
