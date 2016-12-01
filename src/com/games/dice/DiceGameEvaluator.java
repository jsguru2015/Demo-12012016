package com.games.dice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Gururaj
 *
 */
public class DiceGameEvaluator 
{
	
	private HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	
	public void setUserInput(Integer[] data)
	{
		
	}
	
	public int calculateTotalEarnings(Integer[] data)
	{
		int totalEarnings = 0 ;
		processUserInput(data);
		totalEarnings = getTotalEarnings();
		return totalEarnings;
	}
	
	
	private int getTotalEarnings()
	{

		int totalEarnings = 0;
		/* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) 
	      {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         Integer key = (Integer)mentry.getKey() ;
	         Integer value = (Integer)mentry.getValue();
	         System.out.print("key is: "+ key + " & Value is: ");
	         System.out.println(value);
	         switch(key)
	         {
		         case 1 :
		         int v1 = checkAndGetValue(value,1000,100);
		         totalEarnings = totalEarnings + v1;
	        	 System.out.println("totalEarnings" + totalEarnings);
	        	 break;
		         case 2 :
		        	 int v2= checkAndGetValue(value,200,0);
			         totalEarnings = totalEarnings + v2;
		        	 System.out.println("totalEarnings" + totalEarnings);
		        break;
		        case 3 :
			         int v3= checkAndGetValue(value,300,0);
			         totalEarnings = totalEarnings + v3;
		        	 System.out.println("totalEarnings" + totalEarnings);
		        	 break;
			     case 4 :
			        	 int v4 = checkAndGetValue(value,400,40);
				         totalEarnings = totalEarnings + v4;
			        	 System.out.println("totalEarnings" + totalEarnings);
			      break;
			     case 5 :
		        	 int v5 = checkAndGetValue(value,500,0);
			         totalEarnings = totalEarnings + v5;
		        	 System.out.println("totalEarnings" + totalEarnings);
		         break;
			     case 6 :
		        	 int v6 = checkAndGetValue(value,600,0);
			         totalEarnings = totalEarnings + v6;
		        	 System.out.println("totalEarnings" + totalEarnings);
		         break;
		         default:
		        	 break;
        	 
	         }
//	         if(key == 1)
//	         {
//	        	 int v1 = checkAndGetValue(value,1000,100);
//	        	 System.out.println("Total: " + v1);
//	         }
	      }
	      return totalEarnings;
	
	}
	
	private void processUserInput(Integer[] userInputs)
	{
		for(int data: userInputs )
		{
			System.out.println("Data" + data);
			addToMap(data);
		}
		System.out.println("User inputs: " + hmap);
		
	}
	
	private void addToMap(Integer value)
	{
		if(hmap.get(value) == null)
		{
			hmap.put(value, 1);
		}
		else
		{
			Integer mapData = (Integer)hmap.get(value);
			hmap.put(value, mapData+1);
		}
	}
	
	private int checkAndGetValue(int items,int matchingSetValue, int eachOneValue)
	{
		int v1 = (items/3)*matchingSetValue + (items%3)*eachOneValue ;
//		if(items >=3)
//	   	 {
//	   		 v1 = (items/3)*matchingSetValue + (items%3)*eachOneValue ;
//	   	 }
//	   	 else
//	   	 {
//	   		 v1 = items*eachOneValue ;
//	
//	   	 }
		return v1;
		
	}

}
