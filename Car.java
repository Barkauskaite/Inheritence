package com.classes;

public class Car extends Vehicle {
	int year = 0;
	int numberOfDoors = 0;
	
	public Car(String color, int speed) {
		super (color, speed);
	}
	public Car(String color, int speed, int year, int numberOfDoors) {
		super (color, speed);
		this.year = year;
		this.numberOfDoors = numberOfDoors;
	}
	
	public void setYear(int year) {
		this.year = year;		
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public int numberOfDoors() {
		return numberOfDoors;
	}
	
	public String toString() {
		return "Color: " + getColor() + "Speed: " + getSpeed() + " , Year: "+ 
	+ this.year + " , Number of doors: " + this.numberOfDoors;
	}

}
