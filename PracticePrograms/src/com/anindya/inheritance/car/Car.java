package com.anindya.inheritance.car;

public class Car {

	private String make;
	private String model;
	private int year;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	void print()
	{
		System.out.println("Make: " + make + ", Model: " + model + ", Year: " +
				year);
	}



}
