package com.codometer.geeksforgeek.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a stream of integers with dups in it, find the dups 
 *
 */
public class Find_Duplicate_Elements_In_Stream 
{
    public static void main( String[] args )
    {
    	
        Stream<Integer> intStream = Stream.of(12,14,15,26,34,34,12,12,23,45,14);
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupList = intStream.filter(element -> !set.add(element)).collect(Collectors.toSet());
        System.out.println(dupList);
        
    }
}
