package com.qa.vehicles;

public abstract class Vehicle {
	
//PRIVATE VARIABLES
	private int doors;
	private double repairDoor;
	private int id;
	private int wheels;
	private double repairWheel;
	private String type;
	
//ABSTRACT METHOD
	public abstract double calculateBill();
	
//GETTERS AND SETTERS
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public double getRepairDoor() {
		return repairDoor;
	}

	public void setRepairDoor(double repairDoor) {
		this.repairDoor = repairDoor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getRepairWheel() {
		return repairWheel;
	}

	public void setRepairWheel(double repairWheel) {
		this.repairWheel = repairWheel;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//CONSTRUCTOR
	public Vehicle(int doors, double repairDoor, int id, int wheels, double repairWheel, String type) {
		super();
		this.doors = doors;
		this.repairDoor = repairDoor;
		this.id = id;
		this.wheels = wheels;
		this.repairWheel = repairWheel;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [doors=" + doors + ", repairDoor=" + repairDoor + ", id=" + id + ", wheels=" + wheels
				+ ", repairWheel=" + repairWheel + ", type=" + type + "]";
	}
	
}
