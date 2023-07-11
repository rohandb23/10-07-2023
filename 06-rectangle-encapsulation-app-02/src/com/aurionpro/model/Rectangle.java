package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public double rectangleArea() {
		return height*width;
	}
	public double rectanglePerimeter() {
		return 2*height+2*width;
	}
}
