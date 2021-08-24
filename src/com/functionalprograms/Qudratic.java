package com.functionalprograms;

import java.util.Scanner;

public class Qudratic {

	public static void quadratic() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the coeffiecients: ");
		System.out.print("a = ");
		double a = scanner.nextDouble();
		System.out.print("b = ");
		double b = scanner.nextDouble();
		System.out.print("c = ");
		double c = scanner.nextDouble();
		
		double delta = (b*b) - (4*a*c);
		double root1 = (-b + Math.sqrt(delta) )/2 * a;
		double root2 = (-b - Math.sqrt(delta) )/2 * a;
		
		System.out.println("Root1 = "+root1);
		System.out.println("Root2 = "+root2);
	}
}
