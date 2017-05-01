package com.anindya.OOP.runtimepolymorphism;

public class Duck extends Animal{
	
	public Duck(double age, int legs, String breed){
		super();
		this.age = age;
		this.legs = legs;
		this.breed = breed;
	}
	
	public Duck(){
		
	}


	@Override
	public void behavior() {
		System.out.println("Duck do Pack Pack");
	}
}
