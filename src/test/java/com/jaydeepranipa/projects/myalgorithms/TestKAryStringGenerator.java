package com.jaydeepranipa.projects.myalgorithms;

import junit.framework.TestCase;

public class TestKAryStringGenerator extends TestCase {
	public void testGenerate() throws Exception {
		new KAryStringGenerator(5, 4).getBinaryStrings().forEach(s -> System.out.println(s));
	}
}