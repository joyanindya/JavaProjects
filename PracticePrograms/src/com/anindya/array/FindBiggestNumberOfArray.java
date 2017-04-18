package com.anindya.array;

import java.util.Scanner;

public class FindBiggestNumberOfArray {

	public static void main(String[] args) {
		
		int numberOfElements , maxValue;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number of Elements in the Array ");
		
		numberOfElements = sc.nextInt();
		
		int arr [] = new int[numberOfElements];
		
		System.out.println("Enter The Elements in the Array ");
		
		for(int i=0 ;i<numberOfElements;i++){
			arr[i]=sc.nextInt();
		}
		maxValue = arr[0];
		for (int i=0;i<numberOfElements;i++){
			if(maxValue<arr[i]){
				maxValue = arr[i];
			}
		}
		 System.out.println("Maximum Value :"+maxValue);
		
		sc.close();
	}

}
