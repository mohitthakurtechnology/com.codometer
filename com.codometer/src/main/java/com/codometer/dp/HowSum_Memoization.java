package com.codometer.dp;

/**
 * howSum problem is to return an array addition of element of which gives target sum 
 *  with any combination of array elements with memoization approach
 */

public class HowSum_Memoization 
{
	public static boolean canSum(int targetSum,int []numbersArray)
	{
		int remainder;
		
		if(targetSum == 0)
				return true;
		if(targetSum < 0)
			return false;
		
		for(int number : numbersArray)
		{
			remainder = targetSum - number;
			if(canSum(remainder,numbersArray) == true)
				return true;
		} 
		return false;
	}
	
    public static void main( String[] args )
    {
    	int []numberArray = {10,20,30,23,4,54};
    	System.out.println(CanSum_Memoization.canSum(50, numberArray));
    }
}