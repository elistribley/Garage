package com.qa.vehicles;

public class Car extends Vehicle {
	
	private int numberOfWheels;
	
	private String favourite;
	
	
	public Car(String type, String manufacturer, String colour, boolean canFly, int numberOfDoors, int price, int numberOfWheels, String favourite) {
		super(type, manufacturer, colour, numberOfDoors, canFly, price);
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

	@Override
	public String toString() {
		return "Car [Vehicle ID:"	+ getVehicleID() + ", Manufacturer:" + getManufacturer() + ", Colour:" + getColour()
				+ " Number Of Wheels:" + numberOfWheels + ", Favourite:" + favourite + ", Number Of Doors:" + getNumberOfDoors() + ", Flying:" + isCanFly() + ", Price:"
				+ getPrice() + ", Type:" + getType() + ", Class:" + getClass() + "]";
	}

	
	
	
	
}
