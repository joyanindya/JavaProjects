package com.anindya.constructors.main;

import com.anindya.constructors.model.EmployeeConstructors;

public class TestEmployeeConstructor {

	public static void main(String[] args) {
		
		EmployeeConstructors defaultcons = new EmployeeConstructors();
		defaultcons.showDetails();
		EmployeeConstructors parametarized1 = new EmployeeConstructors(123456,"Ram");
		parametarized1.showDetails();
		EmployeeConstructors parametarized2 = new EmployeeConstructors(123456);
		parametarized2.setEmployeeName("Shyam");
		parametarized2.showDetails();
		EmployeeConstructors parametarized3 = new EmployeeConstructors("Ragav");
		parametarized3.setEmpolyeeId(98764);
		parametarized3.showDetails();
	}

}
