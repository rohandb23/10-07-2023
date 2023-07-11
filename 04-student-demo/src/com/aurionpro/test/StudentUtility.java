package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.Utility;
public class StudentUtility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int number = sc.nextInt();
		Utility obj = new Utility();
		obj.findFactorial(number);
		obj.checkPrime(number);
	}
}
