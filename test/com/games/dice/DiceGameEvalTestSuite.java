package com.games.dice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	DiceGameEvalSuccessTest.class,
	DiceGameEvalFailureTest.class })
public class DiceGameEvalTestSuite {

	public class AllTests 
	{
		//No implementation
	}

}
