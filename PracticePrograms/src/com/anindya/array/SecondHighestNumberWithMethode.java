package com.anindya.array;

import java.util.Scanner;

public class SecondHighestNumberWithMethode {

	private static int elementNumber(){
		
		int numberOfElements;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Elements in the Array ");
        numberOfElements = sc.nextInt();
        sc.close();
        return numberOfElements;
        
	}
	
	private static int [] arrayInput(int number){
        int  arr [] = new int[number];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Elements in the Array ");
        for(int i=0 ;i<number;i++){
			System.out.println("Enter the "+(i+1)+" value");
			arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
         
    }
	
	private static int secondHighestNumberCalculation(int array[],int arrayElementNumber){
		int maxValue,secondLargest;
		maxValue = array[0];
		secondLargest =array[1];
		for (int i=0;i<arrayElementNumber;i++){
			if (array[i] > maxValue) {
			    secondLargest = maxValue;
			    maxValue = array[i];
			} else if (array[i] > secondLargest) {
			    secondLargest = array[i];
			}
		}
		 return secondLargest;
	}
	
	public static void main(String [] args){
		int arrayElementNumber = elementNumber();
		int array[]= arrayInput(arrayElementNumber);
		int secondLargestNumber = secondHighestNumberCalculation(array, arrayElementNumber);
		System.out.println("The Second Largest Number is "+ secondLargestNumber);
		
	}
	

}
