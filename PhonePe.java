package com.xworkz.oopsconcept;

public class PhonePe {
	String name;
	long phoneNo;
	String place;
	int adharNumber;
	String panCardNo;

	public PhonePe(String name, long phoneNo, String place) {
		System.out.println("Registered successfuly");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
	}

	public PhonePe(String name, long phoneNo, String place, int adharNumber) {
		System.out.println("Registered successfully");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.adharNumber = adharNumber;
	}

	public PhonePe(String name, long phoneNo, String place, String panCardNo) {
		System.out.println("Registered successfully");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.panCardNo = panCardNo;
	}

	public PhonePe(String name, long phoneNo, String place, int adharNumber, String panCardNo) {
		System.out.println("Registered successfully");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.adharNumber = adharNumber;
		this.panCardNo = panCardNo;
	}

	public void moneyTransfer() {
		System.out.println("Money transferred successfully");
	}

	public void rechargeMob() {
		System.out.println("Mobile recharged");
	}

	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.phoneNo);
		System.out.println(this.place);
		System.out.println(this.adharNumber);
		System.out.println(this.panCardNo);
	}
}
