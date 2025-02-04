package com.codometer.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * howSum problem is to return an array addition of element of which gives target sum even if
 * element is repeated if sum is achieved returned the array
 * with any combination of array elements with memoization approach
 */

public class HowSum_Memoization_All_Combination 
{
	public static List<List<Integer>> howSum(int targetSum,int []numbersArray)
	{	
		int remainder;
		List<Integer> result = new ArrayList<>();
		List<List<Integer>> _Result = new ArrayList<>();
		
//		if(cache.containsKey(targetSum))
//			return cache.get(targetSum);
		
		if(targetSum == 0)
		{
			_Result.add(result);
			return _Result;
		}
		
		if(targetSum < 0)
			return null;
		
		for(int number : numbersArray)
		{
			remainder = targetSum - number;
			
			_Result = howSum(remainder,numbersArray);
			
	//		cache.put(remainder,result); // cache
			if(_Result != null)
			{
				_Result.getLast().add(number);
				return _Result;
			}
		}
		return null;
	}
	
    public static void main( String[] args )
    {
    	int []numberArray = {10,20,30,23,4,54};
   // 	int []numberArray = {7,14}; // edge case without caching it take time but with caching it become faster
  //  	int []numberArray = {2,3};
    	int number = 24;
    	
//    	Map<Integer,List<Integer>> cache = new HashMap<>();
    	System.out.println("How Sum Of Number " + number + " Is => " + HowSum_Memoization_All_Combination.howSum(number, numberArray));
    }
}