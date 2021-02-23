package com.classes;

public class Vehicle {
	private String color = "";
	private int speed = 0;
	
	public Vehicle (String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public String toString() {
		return "Vehicle color: " + color + "\n Vehicle speed: " + speed;
	}
 


}
