package com.codometer.geeksforgeek.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Count occurrence of a given character in a string using Stream API in Java.
 */
public class GetSliceOfAStreamJava 
{
    public static void main( String[] args )
    {
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i = 0;i < 5;i++)
    		list.add(i+10);
        System.out.println("List => " + list);
        
        System.out.println(list.stream().skip(2).limit(4).collect(Collectors.toList()));
    }
}
