package com.anindya.array;

import java.util.Scanner;

public class PrimeNumber {

private static int  elementNumber(){
		
		int numberOfElements;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Elements in the Array ");
        numberOfElements = sc.nextInt();
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
        return arr;
         
	}
	
	private static boolean isPrime(int value){
		
		boolean flag =true;
		
		for (int i=2;i<= Math.sqrt(value);i++){
			if (value%i == 0){
				flag = false;
				break;
			}
			else
				continue;
		}
		
		if(flag)
			return true;
		else 
			return false;
		
	}
	
	
	private static int [] calculatePrimeNumber(int array[],int number){
		 
	int primes[] = new int[100];
	int j=-1;
	
	for(int i=0;i<number;i++){
		if(isPrime(array[i])){
			primes[++j] = array[i];
			count++;
		}
	}
	return primes;
			

}
	static int count =0;
	public static void main(String [] args){
		int arrayElementNumber = elementNumber();
		int array[]= arrayInput(arrayElementNumber);
		for(int i=0;i<arrayElementNumber;i++)
		{
			System.out.print(" "+array[i]);
		}
		int primeNumbers[] = calculatePrimeNumber(array,arrayElementNumber);
		System.out.println();
		
		System.out.println("The number of prime number in the array is : "+count);
		System.out.println("The Prime Numbers are ");
		for(int i =0 ;i<count;i++)
		{
		System.out.print(" "+primeNumbers[i]);
	    }
	}	
}
	

