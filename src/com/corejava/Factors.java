package com.corejava;

import java.util.Scanner;

public class Factors {

	public static void factors() {
		
		System.out.println("Enter the number ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n<0) {
			System.out.println("Please enter the n greater than 0 \n exiting");
			System.exit(0);
		}
		
		System.out.println("Prime factors are");
		
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
		}
	}
}
