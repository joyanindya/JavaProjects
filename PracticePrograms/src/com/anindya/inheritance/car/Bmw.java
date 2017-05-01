package com.anindya.inheritance.car;

public class Bmw extends Car{
	
	private int noOfDoors;
	public Bmw(String make, String model, int year,int noOfDoors) {
		super(make, model, year);
		this.noOfDoors=noOfDoors;
	}
	public double getnoOfDoors() {
		return noOfDoors;
	}
	public void setnoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	 void print()
	   {
	      super.print();
	      System.out.println("Number Of Doors: " + noOfDoors);
	   }

}
