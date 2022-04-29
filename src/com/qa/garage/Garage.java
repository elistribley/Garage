package com.qa.garage;

import com.qa.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;



public class Garage {
	
	private ArrayList<Vehicle> bigwhips = new ArrayList<Vehicle>();
	
	
	
	//CONSTRUCTOR
	public Garage() {}
	
	
	public void printVehicles() {
		System.out.println(this.bigwhips);
		
	}
	
	//GO GETTER
	public ArrayList<Vehicle> getBigWhips(){
		return bigwhips;
	}
	
	//ADDS VEHICLE TO ARRAYLISTINGS
		public void addVehicle(Vehicle vehicle) {
		this.bigwhips.add(vehicle);
		
		
	}
		public void removeVehicle(Vehicle found) {
		if	(this.bigwhips.remove(found)) {
			System.out.println("Vehicle removed!");
			
			
		} else {
			System.out.println("Not vehicle found for that entry!");
			
		}
			
			
		}
		
		
		
		
		
		//CAN REMOVE BY VEHICLE TYPE
		public void removeVehiclesByType(String type) {
			ArrayList<Vehicle> found = new ArrayList<Vehicle>();
			for (Vehicle vehicle : bigwhips) {
				if (vehicle.getType() == type) {
					found.add(vehicle);
				}
			}
			for(Vehicle destroy: found) {
				bigwhips.remove(destroy);
			}
		}
	//SAME WITH ID
		public void removeVehicleById(int id) {
			Vehicle found = null;
			for (Vehicle vehicle : bigwhips) {
				if (vehicle.getVehicleID() == id) {
					found = vehicle;
				}
			}
			removeVehicle(found);
		}
		
		public void emptyGarage() {
			System.out.println("Vehicle(s) removed.");
			this.bigwhips.clear();
		}
	//NOT SURE WHY I CANT PRINT STRINGS IN A SYSO
		public void getBillById(int id) {
			for (Vehicle vehicle : this.bigwhips) {
				if (vehicle.getVehicleID() == id) {
					System.out.println("=".repeat(40));
					System.out.println("Vehicle: " + vehicle.getManufacturer() + "ID: " + vehicle.getVehicleID() + "Colour: " + vehicle.getColour() + "Cost: " + vehicle.calBill());
					break;
				}
			}
				}
				
				
	//NOT SURE WHY I CANT PRINT STRINGS IN A SYSO
		public void calculateIndBills() {
			for (Vehicle vehicle : this.bigwhips) {
						System.out.println("=".repeat(40));
						System.out.println("Vehicle: " + vehicle.getManufacturer() + "ID: " + vehicle.getVehicleID() + "Colour: " + vehicle.getColour() + "Cost: " + vehicle.calBill());
						
				}
			}
		//FOR VEHICLE IN BIG WHIPS, ADD CALBILL TO TOTAL						
		public void calculateTotalBill() {
						double total = 0;
						for (Vehicle vehicle : this.bigwhips) {
							total += vehicle.calBill();
									
		}
						
						System.out.println("The total cost for all vehicles is: £" + total);
}
					
		public void printAll() {
						System.out.println("=".repeat(60));
						System.out.println("=".repeat(25) + " Full list" + "=".repeat(25));
						for (Vehicle vehicle : this.bigwhips) {
						System.out.println(vehicle);
						System.out.println("=".repeat(60));
						}
						
					}
					
					
					
					
					
					
					
					
					
					
}
