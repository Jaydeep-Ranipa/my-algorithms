package com.jaydeepranipa.projects.myalgorithms;

import junit.framework.TestCase;

public class TestPiDecimalPointsGenerator extends TestCase {

	public void testGenerate() throws Exception {
		int count = 10;
		
		int[] decimalPointsExpected = {1,4,1,5,9,2,6,5,3,5};
		int[] decimalPointsActual = PiDecimalPointsGenerator.generate(count);
		
		for (int i = 0; i < count; i++) {
			assertEquals(decimalPointsExpected[i], decimalPointsActual[i]);
		}
	}
	
	public void generateAndPrint() throws Exception {
		int count = 10;
		int[] decimalPoints = PiDecimalPointsGenerator.generate(count);
		for (int i = 0; i < count; i++) {
			System.out.println(decimalPoints[i] + " ");
		}
	}
}
