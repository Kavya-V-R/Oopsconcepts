package com.xworkz.oopsconcept;

public class WaterPurifier {
	String brand;
	int price;
	int serialNumber;
	String model;

	WaterPurifier() {
		System.out.println("constructor with no parameters");
	}

	WaterPurifier(String brand, int price, int serialNumber, String model) {
		System.out.println("constructor with all parameters");
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
		this.model = model;
	}

	public void fillWater() {
		System.out.println("water filled");
	}

	public void purify() {
		System.out.println("water purified");
	}

	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.serialNumber);
		System.out.println(this.model);
	}
}
