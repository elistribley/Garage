package com.qa.vehicles;

public class Car extends Vehicle {
	
	private int numberOfWheels;
	
	private String favourite;
	
	
	public Car(int vehicleID, String type, String manufacturer, String colour, boolean canFly, int numberOfDoors, int numberOfWheels, String favourite, int price) {
		super(vehicleID, type, manufacturer, colour, numberOfDoors, canFly, price);
		this.numberOfWheels = numberOfWheels;
		this.favourite = favourite;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	
	
	public String getFavourite() {
		return favourite;
	}
	
	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}
	
	@Override
	public double calBill() {
		
		return numberOfWheels * 30;

}

	
	
	
	
}
