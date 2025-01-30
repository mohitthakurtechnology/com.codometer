package com.codometer.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * canSum problem is to return true/false if the target sum is achieved with any combination of array
 * elements with memoization approach
 */

public class CanSum_Memoization 
{
	public static boolean canSum(int targetSum,int []numbersArray,List<Integer>cache)
	{
		int remainder;
		
		if(cache.contains(targetSum))
			return true;
		if(targetSum == 0)
				return true;
		if(targetSum < 0)
			return false;
		
		for(int number : numbersArray)
		{
			remainder = targetSum - number;
			cache.add(remainder);
			if(canSum(remainder,numbersArray,cache) == true)
				return true;
		} 
		return false;
	}
	
    public static void main( String[] args )
    {
    	int []numberArray = {10,20,30,23,4,54};
    	List<Integer> cache = new ArrayList<>();
    	System.out.println(CanSum_Memoization.canSum(27, numberArray,cache));
    }
}
