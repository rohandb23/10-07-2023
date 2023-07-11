package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private String colour;
	public void setHeight(double height) {
		this.height = correctHeightAndWidth(height);
	}

	public void setWidth(double width) {
		this.width = correctHeightAndWidth(width);
	}
	
	public void setColour(String colour) {
		this.colour = correctColour(colour);
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColour() {
		return colour;
	}
	
	public double rectangleArea() {
		return height * width;
	}

	public double rectanglePerimeter() {
		return 2 * height + 2 * width;
	}

	private double correctHeightAndWidth(double value) {
		if (value < 1) {
			value = 1;
		} 
		else if (value > 100) {
			value = 100;
		}
		return value;
	}
	private String correctColour(String value1) {
		if (value1.equalsIgnoreCase("black")) {
			return "black";
		} 
		else if (value1.equalsIgnoreCase("blue")) {
			return "blue";
		}
		return "red";
	}
}
