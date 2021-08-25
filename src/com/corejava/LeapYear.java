package com.corejava;

import java.util.Scanner;

public class LeapYear {

	public static void leapYear() {
		System.out.println("Enter the year:");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year<1000 || year>9999) {
			System.out.println("Please enter four digit number \n exiting");
			System.exit(0);
		}
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
		
	}

}
