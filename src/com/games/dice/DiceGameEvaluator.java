package com.games.dice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Gururaj
 *
 */
/**
 * @author Brundavani
 *
 */
public class DiceGameEvaluator 
{
	
	private HashMap<Integer, Integer> userSelections = new HashMap<Integer, 
																Integer>();
	
	/**
	 * @param data user inputs with the values of 5 dice faces
	 * @return int total value for matching set of numbers
	 * @throws UserInputException 
	 */
	public int calculateTotalEarnings(Integer[] data) 
	{
		int totalEarnings = 0 ;
		if(data != null)
		{
			if(data.length == 5)  //Game is with 5 dices
			{
				processUserInput(data);
				totalEarnings = getTotalEarnings();
			}
		}
		return totalEarnings;
	}
	
	
	/**
	 * This method has core business logic implementation
	 * 
	 * @return int
	 */
	@SuppressWarnings("rawtypes")
	private int getTotalEarnings()
	{

		int totalEarnings = 0;
		/* Display content using Iterator*/
	      Set<Entry<Integer, Integer>> set = userSelections.entrySet();
	      Iterator<Entry<Integer, Integer>> iterator = set.iterator();
	      while(iterator.hasNext()) 
	      {
	         Map.Entry mapentry = (Map.Entry)iterator.next();
	         Integer key = (Integer)mapentry.getKey() ;
	         Integer value = (Integer)mapentry.getValue();
	         switch(key)
	         {
		         case 1 :
		         int v1 = checkAndGetMatchingValue(value,1000,100);
		         totalEarnings = totalEarnings + v1;
	        	 break;
		         case 2 :
		        	 int v2= checkAndGetMatchingValue(value,200,0);
			         totalEarnings = totalEarnings + v2;
		        break;
		        case 3 :
			         int v3= checkAndGetMatchingValue(value,300,0);
			         totalEarnings = totalEarnings + v3;
		        	 break;
			     case 4 :
			        	 int v4 = checkAndGetMatchingValue(value,400,40);
				         totalEarnings = totalEarnings + v4;
			      break;
			     case 5 :
		        	 int v5 = checkAndGetMatchingValue(value,500,0);
			         totalEarnings = totalEarnings + v5;
		         break;
			     case 6 :
		        	 int v6 = checkAndGetMatchingValue(value,600,0);
			         totalEarnings = totalEarnings + v6;
		         break;
		         default: //if any other number, just ignore
		        	 break;
        	 
	         }//end of switch

	      }//end of while
	    return totalEarnings;
	}
	
	private void processUserInput(Integer[] userInputs)
	{
		for(int data: userInputs )
		{
			addToMap(data);
		}
	}
	
	private void addToMap(Integer value)
	{
		if(userSelections.get(value) == null)
		{
			userSelections.put(value, 1);
		}
		else
		{
			Integer mapData = (Integer)userSelections.get(value);
			userSelections.put(value, mapData+1);
		}
	}
	
	private int checkAndGetMatchingValue(int items,int matchingSetValue, int eachOneValue)
	{
		int v1 = (items/3)*matchingSetValue + (items%3)*eachOneValue ;
		return v1;
		
	}

}
