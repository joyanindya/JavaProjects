package com.anindya.array;

import java.util.Scanner;

public class SumOfDiagonalElements {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter the array Value ");
				arr[i][j] = sc.nextInt();

			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}

	}
}
