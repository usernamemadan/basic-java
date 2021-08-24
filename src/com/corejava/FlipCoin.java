package com.corejava;

import java.util.Scanner;

public class FlipCoin {

	public static void flipCoin() {
		float headCount = 0;
		float tailCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the times the coin flipped:");
		int n=scanner.nextInt();
		
		if(n<0) {
			System.out.println("Please enter the value greater than 0 \n exiting");
			System.exit(0);
		}
		
		float outcome;
		
		for(int i=0;i<n;i++) {
			outcome = (float) Math.random();
			if(outcome < 0.5)
				tailCount++;
			else
				headCount++;
			
		}
		
		float headPercentage = (headCount/n)*100;
		float tailPercentage = (tailCount/n)*100;
		
		System.out.println("head percentage = " + headPercentage);
		System.out.println("Tail percentage = " + tailPercentage);
	}
}
