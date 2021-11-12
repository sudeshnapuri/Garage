package com.qa.vehicles;

public class Motorcycle extends Vehicle {
	
	private String model = "Original"; 

	
	public Motorcycle(int doors, double repairDoor, int id, int wheels, double repairWheel, String type, String model) {
		super(doors, repairDoor, id, wheels, repairWheel, type);
		this.model = model;
	}

	
	public String model() {
		return model;
	}


	public void setmodel(String model) {
		this.model = model;
	}


	@Override
	public double calculateBill() {
		double bill = (this.getWheels()*this.getRepairWheel()+this.getWheels());
		return bill;
	}


	
}
