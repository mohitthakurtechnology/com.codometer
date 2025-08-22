package com.codometer.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * howSum problem is to return an array addition of element of which gives target sum even if
 * element is repeated if sum is achieved returned the array
 * with any combination of array elements with memoization approach
 */

public class HowSum_Memoization_Any_Combination 
{
	public static List<Integer> howSum(int targetSum,int []numbersArray,Map<Integer,List<Integer>> cache)
	{	
		
		int remainder;
		List<Integer> result = new ArrayList<>();
		
		if(cache.containsKey(targetSum))
			return cache.get(targetSum);
		
		if(targetSum == 0)
			return result;
		
		if(targetSum < 0)
			return null;
		
		for(int number : numbersArray)
		{
			remainder = targetSum - number;
			
			result = howSum(remainder,numbersArray,cache);
			
			cache.put(remainder,result); // cache 
			
			if(result != null)
			{
				result.add(number);
				return result;
			}
		}
		
		return null;
	}
	
    public static void main( String[] args )
    {
    	int []numberArray = {10,20,30,23,4,54};
//    	int []numberArray = {7,14}; // edge case without caching it take time but with caching it become faster
    	int number = 33;
    	
    	Map<Integer,List<Integer>> cache = new HashMap<>();
    	System.out.println("How Sum Of Number " + number + " Is => " + HowSum_Memoization_Any_Combination.howSum(number, numberArray,cache));
    }
}