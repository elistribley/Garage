package com.qa.vehicles;

public class Helicopter extends Vehicle {
	
	
	private int fuelCapacity;
	private int topSpeed;
	
	
	public Helicopter(int vehicleID, String type, String manufacturer, String colour, boolean canFly, int numberOfDoors, int fuelCapacity, int topSpeed, int price) {
		super(vehicleID, type, manufacturer, colour, numberOfDoors, canFly, price);
		this.fuelCapacity = fuelCapacity;
		this.topSpeed = topSpeed;
	}
	
	
	
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	@Override
	public double calBill() {
		return topSpeed * 10;
	
	}
}
