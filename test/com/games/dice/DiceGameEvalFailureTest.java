package com.games.dice;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Gururaj
 * This class tests all exceptional scenarios
 *
 */
public class DiceGameEvalFailureTest {

	@Test
	public void testNoUserInput() 
	{
		Integer[] userInputs = null;
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(0,earnings);
	}
	
	@Test
	public void testImpossibleUserInput() 
	{
		Integer[] userInputs = {7,7,8,9,8};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(0,earnings);
	}
	
	@Test
	public void testIncorrectOutputValue() 
	{
		Integer[] userInputs = {4,4,4,4,4};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertNotEquals(440,earnings);
	}
	
	@Test
	public void testWithLessThanFiveDices() 
	{
		Integer[] userInputs = {4,4,4,4};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(0,earnings);
	}

}
