package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.Rectangle;
public class RectangleTest {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		getUserInputForHeightAndWidth(obj);
		System.out.println(obj.rectangleArea());
		System.out.println(obj.rectanglePerimeter());
		
		Rectangle obj1 = new Rectangle();
		getUserInputForHeightAndWidth(obj1);
		System.out.println(obj1.rectangleArea());
		System.out.println(obj1.rectanglePerimeter());
	}
	private static void getUserInputForHeightAndWidth(Rectangle obj1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter height : ");
		obj1.height = sc.nextDouble();
		System.out.println("enter width : ");
		obj1.width = sc.nextDouble();
	}
}
