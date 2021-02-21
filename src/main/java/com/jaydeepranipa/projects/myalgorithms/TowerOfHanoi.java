package com.jaydeepranipa.projects.myalgorithms;

import java.util.Stack;

public class TowerOfHanoi {
	public static void towerOfHanoi(Stack<Character> tower1, Stack<Character> tower2, Stack<Character> tower3) {
		// transfer top 1 plate from tower1 to tower2
		transfer(tower1, tower2, 1);
		// transfer remaining plates from tower1 to tower2
		transfer(tower1, tower3, tower1.size());
		// transfer all plates but last from tower3 to tower1
		transfer(tower3, tower1, tower3.size() - 1);
		// transfer last plate from tower3 to tower2
		transfer(tower3, tower2, 1);
		// transfer all plates from tower1 to tower2
		transfer(tower1, tower2, tower1.size());
		// transfer all plates from tower2 to tower3
		transfer(tower2, tower3, tower2.size());
	}
	
	public static void transfer(Stack<Character> fromTower, Stack<Character> toTower, int plates) {
		for (int i = 0; i < plates; i++) {
			toTower.push(fromTower.pop());
		}
	}
}
