package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		getUserInputForHeightAndWidth(obj);
		System.out.println("height is : "+obj.getHeight());
		System.out.println("width is : "+obj.getWidth());
		System.out.println("colour is : "+obj.getColour());
		System.out.println("area is : "+obj.rectangleArea());
		System.out.println("perimeter is : "+obj.rectanglePerimeter());
		
	}
	private static void getUserInputForHeightAndWidth(Rectangle obj) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter height : ");
		obj.setHeight(sc.nextDouble());
		System.out.println("enter width : ");
		obj.setWidth(sc.nextDouble());
		sc.nextLine();
		System.out.println("enter colour of rectangle : ");
		obj.setColour(sc.nextLine());
	}
}
