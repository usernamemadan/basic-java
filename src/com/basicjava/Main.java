package com.basicjava;

import com.corejava.*;
import com.functionalprograms.*;

public class Main {

	public static void main(String[] args) {
		
		FlipCoin.flipCoin();
		LeapYear.leapYear();
		if (args.length != 0)
			PowerOf2.powerOf2(args);
		HarmonicNumber.harmonicNumber();
		Factors.factors();
		QuotientAndRemainder.quotientRemainder();
		Swap.swap();
		EvenOrOdd.evenOrOdd();
		VowelOrConsonant.vowelOrconsonant();
		Largest.largest();
		
		TwoDArray.twoDArray();
		SumOf3.sumOf3();
		if (args.length != 0)
			Distance.distance(args);
		Qudratic.quadratic();
		if (args.length != 0)
			WindChill.windChill(args);
	}

}
