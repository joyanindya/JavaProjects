package com.anindya.inheritance.car;

public class TestCar {

	public static void main(String[] args) {
		
          Audi ad =new Audi("German", "A3", 2008, 22.5);
          System.out.println("Make = " + ad.getMake());
          System.out.println("Model = " + ad.getModel());
          System.out.println("Year = " + ad.getYear());
          System.out.println("Milage = " + ad.getMilage());
          ad.print();
          Bmw bw = new Bmw("British","E330",2017,4);
          System.out.println("Make = " + bw.getMake());
          System.out.println("Model = " + bw.getModel());
          System.out.println("Year = " + bw.getYear());
          System.out.println("Doors = " + bw.getnoOfDoors());
          bw.print();
	}

}
