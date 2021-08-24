package com.functionalprograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void twoDArray() {
		Scanner scanner = new Scanner(System.in);
		int m,n;
		int[][] arr = new int[10][10];
		System.out.println("Enter the number of rows and columns:");
		m=scanner.nextInt();
		n=scanner.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j] = scanner.nextInt();
		
		System.out.println("printing the array to output file");
		try {
      			PrintWriter output = new PrintWriter("output.txt");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
						output.print(arr[i][j]+" ");
					output.print("\n");
				}
	
	      			output.close();
	    	}catch(Exception e) {
	      			
			}
	}
}