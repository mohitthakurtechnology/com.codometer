package com.codometer.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Dynamic Programming - To Be Solved
 * howSum problem is to return an array addition of element of which gives target sum even if
 * element is repeated if sum is achieved returned the array
 * with any combination of array elements with memoization approach
 */

public class HowSum_Memoization_All_Combination 
{
//	public static List<List<Integer>> howSum(int targetSum,int []numbersArray,Map<Integer,List<Integer>> cache,List<List<Integer>> finalResult)
//	{	
//		int remainder;
//		List<Integer> result = new ArrayList<>();
//		List<List<Integer>> Result = new ArrayList<>();
//		
//		if(cache.containsKey(targetSum))
//		{
//			result = cache.get(targetSum);
//			finalResult.add(result);
//			return finalResult;
//		}
//		
//		if(targetSum == 0)
//			return finalResult;
//		
//		if(targetSum < 0)
//			return null;
//				
//		for(int number: numbersArray)
//		{
//			remainder = targetSum - number;
//			Result = howSum(remainder,numbersArray,cache,finalResult);
//			
//			if(Result != null)
//			{
//				result.add(number);
//				finalResult.add(result);
//				cache.put(remainder,finalResult.getLast()); // cache
//				//return finalResult;
//			}
//		}
//		return finalResult;
//	}
//	
//    public static void main( String[] args )
//    {
//   //   int []numberArray = {10,20,30,23,4,54};
//   // 	int []numberArray = {7,14}; // edge case without caching it take time but with caching it become faster
//    	int []numberArray = {2,3};
//    	int number = 6;
//    	
//    	List<List<Integer>> finalResult = new ArrayList<>();
//    	Map<Integer,List<Integer>> cache = new HashMap<>();
//    	System.out.println("How Sum Of Number " + number + " Is => " + HowSum_Memoization_All_Combination.howSum(number, numberArray,cache,finalResult));
//    }
}