package com.corejava;

public class PowerOf2 {

	public static void powerOf2(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int ans;
		
		if(n>0 && n<31) {
			for(int i=0; i<n;i++) {
				ans = (int) Math.pow(2, i);
				System.out.println("2^" +i+ "=");
			}
		}
		else
			System.out.println("Please enter number between 0 and 31");
	}

}
