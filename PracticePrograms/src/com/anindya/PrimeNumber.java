package com.anindya;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value = sc.nextInt();
		boolean flag = true;
		
		for (int i=2;i<= Math.sqrt(value);i++){
			if (value%i == 0){
				flag = false;
				break;
			}
			else
				continue;
		}
		
		if(flag)
			System.out.println("The number is Prime");
		else 
			System.out.println("The number is not Prime");
		
		sc.close();

	}

}
 