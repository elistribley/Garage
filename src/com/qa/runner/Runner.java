package com.qa.runner;

import com.qa.vehicles.Car;
import com.qa.vehicles.Bus;
import com.qa.vehicles.Helicopter;
import com.qa.garage.Garage;

public class Runner {
	
	
	
	
	
	public static void main(String[] args) {
		
		Car newCarOne = new Car(0, null, null, null, false, 0, 0, null, 0);
		
		System.out.println(newCarOne);
		
		Bus newBusOne = new Bus(0, null, null, null, 0, false, 0, 0, 0);
		
		System.out.println(newBusOne);
		
		Helicopter newHeliOne = new Helicopter(0, null, null, null, false, 0, 0, 0, 0);
		
		System.out.println(newHeliOne);
		
		Garage garage = new Garage();
		garage.addVehicle(newCarOne);
		garage.addVehicle(newBusOne);
		garage.addVehicle(newHeliOne);
		//System.out.println(garage.getBigWhips());
		
		garage.printAll();
		
		garage.getBillById(1);
		garage.calculateIndBills();
		garage.calculateTotalBill();
		
		
		
		garage.removeVehicleById(1);
		garage.printAll();
		
		garage.removeVehiclesByType("Helicopter");
		garage.printAll();
		
		garage.emptyGarage();
		garage.printAll();
		
		garage.addVehicle(newCarOne);
		garage.printAll();
		
		garage.removeVehicle(newBusOne);
		garage.printAll();
		

	}
	
}
