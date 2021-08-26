package com.functionalprograms;

import java.util.Scanner;

public class SumOf3 {

	public static void sumOf3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) 
			arr[i] = scanner.nextInt();
		
		System.out.println("Triplets are:");
		int count = 0;
		for( int i=0; i<n-2; i++ )
			for( int j=i+1; j<n-1; j++ )
				for( int k=j+1; k<n; k++ )
				{
					if( arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.println(arr[i] + " " + arr[j]+ " " + arr[k]);
						count++;
					}
				}
		
		System.out.println("number of tirplets :" +count);
		}
		
}

