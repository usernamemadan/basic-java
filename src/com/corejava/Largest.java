package com.corejava;

import java.util.Scanner;

public class Largest {

	public static void largest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.print("c = ");
		int c = scanner.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is the largest");
		else if(b>a && b>c)
			System.out.println(b+" is the largest");
		else
			System.out.println(c+" is the largest");
		
	}
}
