package com.anindya.OOP;

 class Car{
	
	     int doors;
	     int wheels;
	     String model;
	     String engine;
	     String color ;
	     
	     void carCategory(){
	    	 System.out.println("This car is "+model+" car");
	     }
	     
	     void showCar(){
	    	 System.out.println("No of Doors in the car "+doors);
	    	 System.out.println("No of Wheels in the car "+wheels);
	    	 System.out.println("Model Of the Car is "+model);
	    	 System.out.println("The engine Of the car is "+engine);
	    	 System.out.println("The Color Of The Car is "+color);
	    	 
	     }
	
}

public class TestCar {

	public static void main(String[] args) {
		
		Car porche =new Car();
		porche.doors=4;
		porche.wheels =4;
		porche.model ="991";
		porche.engine = "sports";
		porche.color="red";
		
		porche.carCategory();
		porche.showCar();
		
		Car bmw = new Car();
		bmw.doors=2;
		bmw.wheels =4;
		bmw.model ="X3";
		bmw.engine = "SUV";
		bmw.color="Black";
		
		bmw.carCategory();
		bmw.showCar();
		
		
		

	}

}
