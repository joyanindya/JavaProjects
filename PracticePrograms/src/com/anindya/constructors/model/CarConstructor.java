package com.anindya.constructors.model;

public class CarConstructor {
         
	 private int doors;
     private int wheels;
     private String model;
     String engine;
     String color ;
     
     public CarConstructor(){
    	 doors = 1;
    	 wheels = 4;
    	 model ="default";
    	 engine = "Normal";
    	 color ="colorless";
    	 System.out.println("Default Constructor Invoked ");
     }
     
     public CarConstructor(int doors, int wheels, String model, String engine, String color) {
		super();
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.color = color;
	}

	public CarConstructor(int doors, int wheels, String model, String engine) {
		super();
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showCar(){
    	 System.out.println("No of Doors in the car "+doors);
    	 System.out.println("No of Wheels in the car "+wheels);
    	 System.out.println("Model Of the Car is "+model);
    	 System.out.println("The engine Of the car is "+engine);
    	 System.out.println("The Color Of The Car is "+color);
    	 
     }


}
