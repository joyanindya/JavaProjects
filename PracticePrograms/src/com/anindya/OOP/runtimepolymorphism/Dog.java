package com.anindya.OOP.runtimepolymorphism;

public class Dog extends Animal {
	
	public Dog(double age, int legs, String breed){
		super();
		this.age = age;
		this.legs = legs;
		this.breed = breed;
	}
	
	public Dog(){
		
	}

	@Override
	public void behavior() {
		System.out.println("Dog Barks");
	}
	
} 
