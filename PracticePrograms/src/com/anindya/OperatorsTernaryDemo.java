package com.anindya;

import java.util.Scanner;

public class OperatorsTernaryDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for a");
		int a = sc.nextInt();
		System.out.println("Enter the value for b");
		int b = sc.nextInt();

		// result = testStatement ? value1 : value2;

		String result = (a > b) ? ("a is bigger, the number is "+ a ): ("b is bigger, the number is "+ b );
		System.out.println(result);

		//int max = (a > b) ? a : b;
		//System.out.println("Biggest number is " + max);
		// boolean result = (a>b) ? true:false;

		sc.close();

	}

}
