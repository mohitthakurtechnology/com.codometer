package com.codometer.geeksforgeek.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array of positive integers arr[] of size n, 
 * the task is to find second largest distinct element in the array.
 *Note: If the second largest element does not exist, return -1.

	Examples:

	Input: arr[] = [12, 35, 1, 10, 34, 1]
	Output: 34
	Explanation: The largest element of the array is 35 and 
	the second largest element is 34.
 */

public class SecondLargest_EasyProblem 
{
    public static void main( String[] args )
    {
    	//int arr[] = {12, 35, 1, 10, 34, 1};
    	//int arr[] = {10, 10, 10};
    	int arr[] = {10, 5, 10}; //5,10,10;
    	int last = 0, second_last = -1;
    	// there is another approach using Arrays class using sorting
    	// sorting the array first
    	Arrays.sort(arr);
    	// looping from last
    	int n = arr.length;
    	for(int i = n - 2;i >= 0;i--)
    	{
    		if(arr[i] != arr[n - 1])
    		{
    			second_last = arr[i];
    			i = 0;
    		}
    	}
    	System.out.println(second_last);
    	
    	/*
    	 * there is another way where we have use 2 loop to figure largest then 
    	 * second largest
    	 */
    	
    	/*
    	 * approach with collections using sorting
    	HashSet<Integer> set = new HashSet<>();
    	for(int i = 0;i < arr.length;i++)
    		set.add(arr[i]);
    	List<Integer> newlist = new ArrayList<>(set);
    	Collections.sort(newlist);
//    	for(int i = 0;i < arr.length;i++)
//    	{
//    		if(second_last < last && second_last < arr[i])
//				second_last = arr[i];
//    		if(arr[i] > last)
//    			last = arr[i];
//    	}
    	System.out.println("arraylist => "+ newlist);
    	System.out.println("last element is => "+ newlist.get(newlist.size() - 1));
    	if(newlist.size()>1)
    		System.out.println("second_last element is => "+ newlist.get(newlist.size()-2));
    	else
    		System.out.println("second_last element is => -1");*/
    }
}
