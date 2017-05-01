package com.anindya.array;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value = sc.nextInt();
		int temp =value;
		int sum=0 ,r;
		while(value>0){
			r=value%10;  //getting remainder  
			sum=(sum*10)+r;    
			value=value/10;
		}
		if (temp == sum)
			System.out.println("Pallindrome Number");
		else
			System.out.println("Not Pallindrome Number ");
		sc.close();
	}

}
