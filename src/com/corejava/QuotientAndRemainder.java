package com.corejava;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void quotientRemainder() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Divendend and Divisor");
		System.out.print("Dividend = ");
		int a = scanner.nextInt();
		System.out.print("Divisor = ");
		int b = scanner.nextInt();
		
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("Quotient = "+quotient+"\n"+"Remainder = "+remainder);
	}
}
