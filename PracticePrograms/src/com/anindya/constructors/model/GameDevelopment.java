package com.anindya.constructors.model;

import java.util.Scanner;

public class GameDevelopment {
	
	private int score;
	private int level;
	
	public void startGame(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Do You Want to Play The Game? (Yes/No)");
		String affermative = sc.next();
		if (affermative.equals("Yes")||affermative.equals("Y")||affermative.equals("yes"))
			playGame();
		else
			System.out.println("Thanks for visiting");
		sc.close();
		
	}
	
	public void showDetails()
	{
		level = score/100;
		System.out.println("your Level is "+level);
		System.out.println("your Score is "+score);
		
	}
	
	private void playGame(){
		
		do{
		System.out.println("Enter Appropriate Key A,B,Or C or to exit Enter X");
		Scanner sc = new Scanner(System.in);
		char condition = sc.next().charAt(0);
		switch(condition){
		case 'A':
			score += 10;
			break;
		case 'C':
			score += 20;
			break;
		case 'B':
			score += 10;
			break;
		case 'X':
			showDetails();
			System.exit(0);
			break;
		default:
			System.out.println("Not A Valid Key");
		}
		}while(true);
		
		
		
		
	}

}
