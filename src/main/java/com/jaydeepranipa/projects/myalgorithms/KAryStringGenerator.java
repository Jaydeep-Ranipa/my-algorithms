package com.jaydeepranipa.projects.myalgorithms;

import java.util.ArrayList;
import java.util.List;

public class KAryStringGenerator {
	
	private int[] array;
	private List<String> kAryStrings;
	private int digits;
	private int k;

	public KAryStringGenerator(int digits, int k) {
		this.digits = digits;
		this.k = k;
		this.kAryStrings = new ArrayList<String>();
		this.array = new int[digits];
	}

	public final List<String> getBinaryStrings() {
		generate(digits, k);
		return kAryStrings;
	}

	private void generate(int n, int k) {
		if (n == 0) {
			kAryStrings.add(getArrayAsString(array));
		} else {
			for (int i = 0; i < k; i++) {
				array[n-1] = i;
				generate(n-1, k);
			}
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
