package com.qa.vehicles;

public class Bus extends Vehicle {
	
	private int numberOfFloors;
	private int capacity;
	
	
	public Bus(int vehicleID, String type, String manufacturer, String colour, int numberOfDoors, boolean canFly, int numberOfFloors,
			int capacity, int price) {
		super(type, manufacturer, colour, numberOfDoors, canFly, price);
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

	@Override
	public String toString() {
		return "Bus [Vehicle ID:" + getVehicleID() +  "Manufacturer:" + getManufacturer() + ", Colour:" + getColour() + ", Number Of Doors:"
				+ "Number Of Floors:" + numberOfFloors + ", Capacity:" + capacity + getNumberOfDoors() + ", Flying:" + isCanFly() + ", Price:" + getPrice() + ", getType:"
				+ getType() + "]";
	}
	
	
	
	 
	
	
}