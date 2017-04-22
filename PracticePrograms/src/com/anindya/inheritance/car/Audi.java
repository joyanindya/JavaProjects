package com.anindya.inheritance.car;

public class Audi extends Car {

	private double milage;
	public Audi(String make, String model, int year,double milage) {
		super(make, model, year);
		this.milage=milage;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	 void print()
	   {
	      super.print();
	      System.out.println("Milage: " + milage);
	   }

}
