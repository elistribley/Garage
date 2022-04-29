package com.qa.vehicles;

public class Bus extends Vehicle {
	
	private int numberOfFloors;
	private int capacity;
	
	
	public Bus(int vehicleID, String type, String manufacturer, String colour, int numberOfDoors, boolean canFly, int numberOfFloors,
			int capacity, int price) {
		super(vehicleID, type, manufacturer, colour, numberOfDoors, canFly, price);
		this.numberOfFloors = numberOfFloors;
		this.capacity = capacity;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public double calBill() {
		return capacity * 26;
}
}