package com.anindya.array;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value = sc.nextInt();
		int temp =value;
		int c=0 ,a;
		while(value>0){
			a=value%10;
			value /= 10;
			c +=(a*a*a);
		}
		if(temp ==c )
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number ");
		sc.close();
	}


}
