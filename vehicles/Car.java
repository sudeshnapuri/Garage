package com.qa.vehicles;

public class Car extends Vehicle {
	
	private String colour = "Red";
	
	
	public Car(int doors, double repairDoor, int id, int wheels, double repairWheel, String type, String colour) {
		super(doors, repairDoor, id, wheels, repairWheel, type);
		this.colour = colour;
	}
	
	
	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public double calculateBill() {
		double bill = (this.getWheels()*this.getRepairWheel())+((2*this.getDoors())*this.getRepairDoor());
		return bill;
	}
	
}
