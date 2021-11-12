package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorcycle;
import com.qa.vehicles.Van;

public class Runner {
	
	public static void main(String[] args) {
		
// CREATING OBJECTS FOR CAR, VAN, MOTORCYCLE
		Car car = new Car(5, 100.4, 111, 4, 90.4, "Type 1", "Red" );
		Car car2 = new Car(2, 13.4, 222, 4, 93.4, "Type 2", "Orange" );
		Van van = new Van(3, 200.9, 333, 4, 40.4, "Type 1", "Ford");
		Van van2 = new Van(3, 200.9, 444, 6, 560.4, "Type 2", "BMW");
		Motorcycle motorcycle = new Motorcycle(0, 0, 555, 2, 45.75, "Type 1", "Original");
		Motorcycle motorcycle2 = new Motorcycle(0, 0, 666, 2, 45.75, "Type 2", "Notoriginal");
		
// ADDING OBJECTS TO ARRAYLIST
		Garage g = new Garage();
		g.addToList(car);
		g.addToList(car2);
		g.addToList(van);
		g.addToList(van2);
		g.addToList(motorcycle);
		g.addToList(motorcycle2);
		
// CALLING PRINT ALL VEHICLES METHOD FROM GARAGE
		g.printVehicles();
		
// CALLING PRINT CALCULATE BILL METHOD FROM GARAGE
		g.calculateBill();
		
// CALLING REMOVING BY ID METHOD FROM GARAGE
//		g.removeById(222);
		
// CALLING ADDING BY ID METHOD FROM GARAGE
//		g.addById(222);
		
// CALLING REMOVING BY TYPE METHOD FROM GARAGE		
//		g.removeByType("Type 1");
		
// CALLING ADDING BY TYPE METHOD FROM GARAGE
//		g.addByType("Type 2");
				
	}
	
}
