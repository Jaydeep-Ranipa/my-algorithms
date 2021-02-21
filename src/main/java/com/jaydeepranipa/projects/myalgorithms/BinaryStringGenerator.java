package com.jaydeepranipa.projects.myalgorithms;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringGenerator {
	
	private int[] array;
	private List<String> binaryStrings;
	private int digits;

	public BinaryStringGenerator(int digits) {
		this.digits = digits;
		this.binaryStrings = new ArrayList<String>();
		this.array = new int[digits];
	}

	public final List<String> getBinaryStrings() {
		generate(digits);
		return binaryStrings;
	}

	private void generate(int n) {
		if (n == 0) {
			binaryStrings.add(getArrayAsString(array));
		} else {
			array[n-1] = 0;
			generate(n-1);
			array[n-1] = 1;
			generate(n-1);
		}
	}

	private static String getArrayAsString(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		return sb.toString();
	}
}
