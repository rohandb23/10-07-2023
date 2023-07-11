package com.aurionpro.model;

public class Rectangle {
	public double height;
	public double width;
	public double rectangleArea() {
		//double area = height*width;
		//System.out.println("area of rectangle is : "+area);
		return height*width;
	}
	public double rectanglePerimeter() {
		//double perimeter = 2*(a+b);
		//System.out.println("area of rectangle is : "+perimeter);
		return 2*height+2*width;
	}
}