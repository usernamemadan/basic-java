package com.corejava;

import java.util.Scanner;

public class Swap {

	public static void swap() {
		
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		
		System.out.println("Before Swapping a = "+a+" "+" b = "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping a = "+a+" "+" b = "+b);
	}

}
