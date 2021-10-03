package com.xworkz.oopsconcept;

public class Ipod {
	String brand;
	int imeinumber;
	int price;
	int batterycapacity;
	String colour;
	int processor;
	int ram;
	boolean isSupportFingerprint;

	Ipod() {
		System.out.println("constructor with no parameter");
	}

	Ipod(String brand, int imeinumber, int price) {
		System.out.println("constructor with 3 parameters");
		this.brand = brand;
		this.imeinumber = imeinumber;
		this.price = price;
	}

	Ipod(String brand, int imeinumber, int price, int batterycapacity, String colour, int processor, int ram,
			boolean isSupportFingerprint){
		System.out.println("constructor with all parameters");
		this.brand = brand;
		this.imeinumber = imeinumber;
		this.price = price;
		this.batterycapacity = batterycapacity;
		this.colour = colour;
		this.processor = processor;
		this.ram = ram;
		this.isSupportFingerprint = isSupportFingerprint;
	}

	public void switchOn() {
		System.out.println("switched on");
	}

	public void switchOff() {
		System.out.println("switched off");
	}

	public void playMusic() {
		System.out.println("music played");
	}

	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.imeinumber);
		System.out.println(this.price);
		System.out.println(this.batterycapacity);
		System.out.println(this.colour);
		System.out.println(this.processor);
		System.out.println(this.ram);
		System.out.println(this.isSupportFingerprint);

	}
}
