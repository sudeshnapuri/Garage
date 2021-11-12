package com.qa.vehicles;

public class Van extends Vehicle {
	
	private String make = "Ford";
	
	
	public Van(int doors, double repairDoor, int id, int wheels, double repairWheel, String type, String make) {
		super(doors, repairDoor, id, wheels, repairWheel, type);
		this.make = make;
	}

	
	public String getMake() {
		return make;
	}

	
	public void setMake(String make) {
		this.make = make;
	}

	
	@Override
	public double calculateBill() {
		double bill = ((2*this.getWheels())*this.getRepairWheel())+(this.getDoors()*this.getRepairDoor());
		return bill;
	}
	
}
	
