package com.jaydeepranipa.projects.myalgorithms;

public class Factorial {

	public static int factorial(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * factorial(a-1);
		}
	}
}
