package com.functionalprograms;

public class Distance {

	public static void distance(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("Distance = "+distance);
	}
}
