package com.anindya.OOP.runtimepolymorphism;

public class Animal {
	
	protected double age ;
	protected int legs;
	protected String breed;
	
	public double getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Animal() {
		super();
	}
	public Animal(double age, int legs, String breed) {
		super();
		this.age = age;
		this.legs = legs;
		this.breed = breed;
	}
	
	public void behavior(){
		System.out.println("The normal Animal");
	}
	
	public void showAnimalProperties(){
		System.out.println("The age is "+age);
		System.out.println("The number of legs are "+legs);
		System.out.println("The Breed is "+breed);
	}
	
	
	

}
