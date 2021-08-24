package com.corejava;

import java.util.Scanner;

public class EvenOrOdd {

	public static void evenOrOdd(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n + " is even");
		}
		else
			System.out.println(n + " is odd");
	}
}
