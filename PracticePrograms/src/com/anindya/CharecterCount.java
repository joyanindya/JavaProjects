package com.anindya;

import java.util.Scanner;

public class CharecterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String inp_str = sc.next();
		int count= 0;
		for(int i=0;i<inp_str.length(); i++)
		{

			for(int j=0; j<inp_str.length(); j++){

				if(inp_str.charAt(i) == inp_str.charAt(j)){
					count ++;
				}
			}
			if (count != 0)
				System.out.print(inp_str.charAt(i));	
			System.out.print( "= "+count+"\n");
			count=0;
		}
		sc.close();

	}

}
