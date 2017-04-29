package com.anindya.OOP.runtimepolymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		VetenaryDoctor vt = new VetenaryDoctor();
		Animal al = new Dog(6.5,4,"German Shephard");
        vt.determineBehaviorForAnimals(al);
        vt.determinePropertiesForAnimals(al);
        
        Animal al1 = new Cat(3.5,4,"white");
        vt.determineBehaviorForAnimals(al1);
        vt.determinePropertiesForAnimals(al1);
        
        Animal al2 = new Duck(2.5,2,"Royal");
        vt.determineBehaviorForAnimals(al2);
        vt.determinePropertiesForAnimals(al2);
        
	}

}
