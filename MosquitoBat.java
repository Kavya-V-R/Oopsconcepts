package com.xworkz.oopsconcept;

public class MosquitoBat {
	String brand;
	String colour;
	int price;

	MosquitoBat() {
		System.out.println("constructor with no parameters");
	}

	MosquitoBat(String brand, String colour, int price) {
		System.out.println("constructor with all parameters");
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}

	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.colour);
		System.out.println(this.price);
	}
}
