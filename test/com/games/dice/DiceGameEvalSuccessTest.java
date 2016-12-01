package com.games.dice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceGameEvalSuccessTest {

	@Test
	public void testSuccessWithInput1() {
		Integer[] userInputs = {4,4,4,4,4};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		gameEvaluator.setUserInput(userInputs);
		int earnings = gameEvaluator.calculateTotalEarnings();
		assertEquals(480,earnings);
	}

}
