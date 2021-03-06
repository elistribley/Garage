package com.qa.vehicles;

public abstract class Vehicle {
	
	
	
	private int vehicleID;
	private String type;
	private String manufacturer;
	private String colour;
	private int numberOfDoors;
	private boolean canFly;
	private int price;
	
	private static int count =0;
	
	public Vehicle(String type, String manufacturer, String colour, int numberOfDoors, boolean canFly, int price) {
		
		this.vehicleID = count++;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.canFly = canFly;
		this.price = price;
		
	}
	
	
	
	public int getVehicleID() {
		return vehicleID;
	}



	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public int getNumberOfDoors() {
		return numberOfDoors;
	}



	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}



	public boolean isCanFly() {
		return canFly;
	}



	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}

	

	



	public abstract double calBill();



	


	
	
	
	
	
	
	

}
