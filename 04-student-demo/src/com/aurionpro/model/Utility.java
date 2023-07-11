package com.aurionpro.model;
public class Utility {
	public static int findFactorial(int a) {
		int fact=1;
		for (int i = 1; i <= a; i++) {
			fact= fact*i;
		}
		System.out.println("factorial is : "+fact);
		return fact;
	}
	public static int checkPrime(int a) {
		int count=0;
		for (int i = 2; i < a; i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count != 0) {
			System.out.println("number is not prime");
		}
		else {
			System.out.println("number is prime");
		}
		return count;
	}
}
