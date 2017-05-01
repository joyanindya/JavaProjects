package com.anindya.array;

import java.util.Scanner;

public class SumOf2DArrayElements {

	public static void main(String[] args) {

		int arr[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		

		for(int i=0;i<arr.length;i++){

			System.out.println("Each internal array length : "+arr[i].length);
		}

		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter the array Value ");
				arr[i][j] = sc.nextInt();

			}
		}
		int totalSum = sum2d(arr);
		System.out.println("The sum is "+totalSum);
		sc.close();


	}

	private static int sum2d (int[][] array2d)  
	{
		int sum = 0;
		for (int row=0; row < array2d.length; row++)
		{
			for (int col=0; col < array2d[row].length; col++)
			{
				sum = sum + array2d [row][col];
			}
		}

		return sum;
	}

}
