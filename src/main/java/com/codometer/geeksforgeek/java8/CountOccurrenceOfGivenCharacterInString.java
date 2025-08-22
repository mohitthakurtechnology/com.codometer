package com.codometer.geeksforgeek.java8;

/**
 * Count occurrence of a given character in a string using Stream API in Java.
 */
public class CountOccurrenceOfGivenCharacterInString 
{
    public static void main( String[] args )
    {
    	String string = "parallel streams in java";
    	
    	char ch = 'l';
    	Long count = string.chars().filter(character -> character == ch).count();
        System.out.println(ch + " => " + count);
    }
}
