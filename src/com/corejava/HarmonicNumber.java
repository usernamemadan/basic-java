package com.corejava;

import java.util.Scanner;

public class HarmonicNumber {

	public static void harmonicNumber() {
		
		float sum = 0 ;
		
		System.out.println("Enter the number :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n<0) {
			System.out.println("Please enter n greater than 0 \n exiting");
			System.exit(0);
		}
		
		for(float i=1;i<=n;i++) {
			sum+=(1/i);
		}
		System.out.println("Harmonic number = " + sum);
	}
}
