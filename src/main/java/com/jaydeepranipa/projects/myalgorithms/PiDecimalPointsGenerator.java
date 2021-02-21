package com.jaydeepranipa.projects.myalgorithms;

public class PiDecimalPointsGenerator {

	public static int[] generate(int count) {
		int[] decimalPoints = new int[count];
		
		int numer = 16;
		int denom = 113;
		
		for (int i = 0; i < count; i++) {
			numer = numer * 10;
			decimalPoints[i] = numer / denom;
			numer = numer % denom;
		}
		return decimalPoints;
	}
}
