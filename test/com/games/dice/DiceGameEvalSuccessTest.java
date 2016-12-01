package com.games.dice;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class tests all the happy paths
 * 
 * @author Gururaj
 *
 */
public class DiceGameEvalSuccessTest 
{

	@Test
	public void testSuccessWithInput1() 
	{
		Integer[] userInputs = {1,2,3,4,5};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(140,earnings);
	}
	
	@Test
	public void testSuccessWithInput2() 
	{
		Integer[] userInputs = {1,1,1,2,2};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(1000,earnings);
	}
	
	@Test
	public void testSuccessWithInput3() 
	{
		Integer[] userInputs = {5,4,5,4,5};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(580,earnings);
	}
	
	@Test
	public void testSuccessWithInput4() 
	{
		Integer[] userInputs = {4,4,4,4,4};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(480,earnings);
	}
	
	
	@Test
	public void testSuccessWithInput5() 
	{
		Integer[] userInputs = {1,5,5,5,1};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(700,earnings);
	}
	
	@Test
	public void testSuccessWithInput6() 
	{
		Integer[] userInputs = {2,3,5,6,2};
		DiceGameEvaluator gameEvaluator = new DiceGameEvaluator();
		int earnings = gameEvaluator.calculateTotalEarnings(userInputs);
		assertEquals(0,earnings);
	}

}
