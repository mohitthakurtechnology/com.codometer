package com.codometer.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Memoization Approach
 * Recursive Approach
 */
public class Fib_Memoization 
{
	public static int fibSeries(int number,List<Integer> cache)
	{
		int sum = 0;
		
		if(cache.contains(number))
			return number;
		
		if(number < 2)
			return 1;
		
		cache.add(number);
		sum = fibSeries(number - 1,cache) + fibSeries(number - 2,cache);
		 
		return sum;
	}
    public static void main( String[] args )
    {
    	List<Integer> cache = new ArrayList<>();
    	
        System.out.println(fibSeries(5,cache));
    }
}
