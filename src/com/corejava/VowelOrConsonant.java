package com.corejava;

import java.util.Scanner;

public class VowelOrConsonant {
		
		public static void vowelOrconsonant() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the alphabet");
			char alphabet = scanner.next().charAt(0);
			
			char[] array = {'a','e','i','o','u','A','E','I','O','U'};
			
			for(int i=0;i<array.length;i++) {
				if(array[i] == alphabet) {
					System.out.println(alphabet+" is a Vowel");
					System.exit(0);
				}
			}
			System.out.println(alphabet+" is a consonant.");
		}
}

