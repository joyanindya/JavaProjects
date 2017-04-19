package com.anindya.constructors.main;

import com.anindya.constructors.model.CarConstructor;

public class TestCarConstructor {

	public static void main(String[] args) {
		
		CarConstructor porchedefault =new CarConstructor();//default Constructor
		porchedefault.showCar();
		CarConstructor porche1 =new CarConstructor(4,4,"Porche991","Sports","black");
		porche1.showCar();
		CarConstructor porche2 =new CarConstructor(4,4,"sierra","lauxary");
		porche2.setColor("Red");
		porche2.showCar();
		
		
		
	}

}
