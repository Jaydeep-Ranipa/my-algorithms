package com.jaydeepranipa.projects.myalgorithms;

import junit.framework.TestCase;

public class TestBinaryStringGenerator extends TestCase {

	public void testGenerate() throws Exception {
		new BinaryStringGenerator(3).getBinaryStrings().forEach(binary -> System.out.println(binary));
	}
}
