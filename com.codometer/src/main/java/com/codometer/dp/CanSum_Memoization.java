package com.codometer.dp;

/**
 * canSum problem is to return true/false if the target sum is achieved with any combination of array
 * elements with memoization approach
 */

public class CanSum_Memoization 
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
