package com.jaydeepranipa.projects.myalgorithms;

import java.util.Stack;

import junit.framework.TestCase;

public class TestTowerOfHanoi extends TestCase {
	private static Stack<Character> tower1;
	private static Stack<Character> tower2;
	private static Stack<Character> tower3;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		tower1 = new Stack<Character>();
		tower2 = new Stack<Character>();
		tower3 = new Stack<Character>();
	}
	
	public static void printStacks() {
		System.out.println("----------");
		System.out.println("Tower 1: " + stackToString(tower1));
		System.out.println("Tower 2: " + stackToString(tower2));
		System.out.println("Tower 3: " + stackToString(tower3));
	}

	public static String stackToString(Stack<Character> stack) {
		return new StringBuffer(stack.toString().replace(" ", "").replace("[", "").replace("]", "").replace(",", "")).toString();
	}
	
	private static void assertTowers(String exp1, String exp2, String exp3) {
		assertEquals(exp1, stackToString(tower1));
		assertEquals(exp2, stackToString(tower2));
		assertEquals(exp3, stackToString(tower3));
	}
	
	public void testTransfer() throws Exception {
		tower1.push('a');
		tower1.push('b');
		tower1.push('c');
		tower1.push('d');
		TowerOfHanoi.transfer(tower1, tower2, 1);
		TowerOfHanoi.transfer(tower1, tower3, 3);
		
		assertTowers("", "d", "cba");
	}
	
	public void testTowerOfHanoi() throws Exception {
		tower1.push('a');
		tower1.push('b');
		tower1.push('c');
		tower1.push('d');
		
		TowerOfHanoi.towerOfHanoi(tower1, tower2, tower3);

		assertTowers("", "", "abcd");
	}
	
	public void testTowerOfHanoi2() throws Exception {
		tower1.push('A');
		tower1.push('B');
		tower1.push('C');
		tower1.push('D');
		tower1.push('E');
		tower1.push('F');
		tower1.push('G');
		tower1.push('H');
		tower1.push('I');
		tower1.push('J');
		tower1.push('K');
		tower1.push('L');
		tower1.push('M');
		tower1.push('N');
		tower1.push('O');
		tower1.push('P');
		tower1.push('Q');
		tower1.push('R');
		tower1.push('S');
		tower1.push('T');
		tower1.push('U');
		tower1.push('V');
		tower1.push('W');
		tower1.push('X');
		tower1.push('Y');
		tower1.push('Z');
		
		assertTowers("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "", "");
		
		TowerOfHanoi.towerOfHanoi(tower1, tower2, tower3);

		assertTowers("", "", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
}
