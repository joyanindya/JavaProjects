package com.anindya.OOP.runtimepolymorphism;

public class Cat extends Animal {
	
	public Cat(double age, int legs, String breed){
		super();
		this.age = age;
		this.legs = legs;
		this.breed = breed;
	}
	
	public Cat(){
		
	}


	@Override
	public void behavior() {
		System.out.println("Cat Meaoowws");
	}
	
	

}
