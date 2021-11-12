package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import com.qa.vehicles.Vehicle;

public class Garage {
	
//	CREATED ARRAYLIST
	public static List<Vehicle> vehicleList = new ArrayList<>();
	
//	ADDING VEHICLES TO ARRAYLIST
	public void addToList(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}
	
// FOR LOOP TO PRINT ALL VEHICLES
	public void printVehicles() {
		for(Vehicle vehicle : this.vehicleList) {
			System.out.println(vehicle);
		}
	}
		
// FOR LOOP TO CALCULATE BILL FOR EACH VEHICLE
	public void calculateBill() {
			for(Vehicle vehicle : this.vehicleList) {
				System.out.println(vehicle.calculateBill());
		}
	}
	
// TO REMOVE VEHICLE BY ID
// REMOVE VEHICLE METHOD AND PRINT CONFIRMATION IF VEHICLE IS REMOVED
	public void removeVehicle(Vehicle vehicle) {
		if (this.vehicleList.remove(vehicle)) {
			System.out.println("This vehicle has been removed");
		} else {
			System.out.println("This vehicle could not be found");
		}
	}
// IF VEHICLE ID MATCHES INPUT ID THEN CHANGE VEHICLEFOUND FROM NULL TO VEHICLE THEN CALL REMOVEVEHICLE METHOD
	public void removeById(int id) {
		Vehicle vehicleFound = null;
		
		for(Vehicle vehicle : vehicleList) {
			if(vehicle.getId() == id) {
				vehicleFound = vehicle;
			}
		}
		removeVehicle (vehicleFound);		
	}
	
// TO ADD VEHICLE BY ID
	public void addVehicle(Vehicle vehicle) {
		if (this.vehicleList.add(vehicle)) {
			System.out.println("This vehicle has been added");
		} else {
			System.out.println("This vehicle could not be found");
		}
	}
	
	public void addById(int id) {
		Vehicle vehicleFound = null;
		
		for(Vehicle vehicle : vehicleList) {
			if(vehicle.getId() == id) {
				vehicleFound = vehicle;
			}
		}
		addVehicle (vehicleFound);		
	}
// TO REMOVE VEHICLE BY TYPE
		public void removeByType(String type) {
			Vehicle vehicleFound = null;
			
			for(Vehicle vehicle : vehicleList) {
				if(vehicle.getType() == type) {
					vehicleFound = vehicle;
				}
			}
			removeVehicle (vehicleFound);
		}
		
// TO ADD VEHICLE BY TYPE
		public void addByType(String type) {
					Vehicle vehicleFound = null;
					
		for(Vehicle vehicle : vehicleList) {
				if(vehicle.getType() == type) {
					vehicleFound = vehicle;
				}
			}
			addVehicle (vehicleFound);
				}
		
// TO FIX VEHICLE AND CALCULATE BILL
		public void fixVehicle() {
			for (Vehicle vehicle : vehicleList) {
			}
		}
		
}
