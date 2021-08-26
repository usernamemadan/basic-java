package com.functionalprograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void twoDArray() {
		Scanner scanner = new Scanner(System.in);
		
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
		
		int row,col;
		out.println("Enter the number of rows: ");
		row = scanner.nextInt();
		out.println("Enter the number of columns: ");
		col = scanner.nextInt();
		
		int array[][] = new int[row][col];
		
		out.println("Enter Array elements");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				array[i][j] = scanner.nextInt();
		
		out.println("Array elements are: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				out.print(array[i][j]+" ");
			out.println();
		}
		
	}
}