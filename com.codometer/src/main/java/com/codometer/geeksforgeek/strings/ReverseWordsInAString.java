package com.codometer.geeksforgeek.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a string str, the task is to reverse the order of the words in the given string. 
 * Note that str may contain leading or trailing dots(.) or multiple trailing dots(.) between two words. The returned string should only have a single dot(.) separating the words.
	Examples:

	Input: str = “i.like.this.program.very.much” 
	Output: str = “much.very.program.this.like.i” 

	Input: str = ”..geeks..for.geeks.” 
	Output: str = “geeks.for.geeks”
 *
 */
public class ReverseWordsInAString 
{
    public static void main( String[] args )
    {
       String string = "i.like.this.program.very.much";
       //String string = "..geeks..for.geeks.";
       String [] stringPostDotRemoval = string.split("\\.");
       String finalstringPostDotRemoval;
       
       List<String> list = Arrays.asList(stringPostDotRemoval);
       list = list.stream().filter(element -> element.length() > 0).collect(Collectors.toList());
       Collections.reverse(list);
       finalstringPostDotRemoval = String.join(".", list);  
       System.out.println("eachString => " + finalstringPostDotRemoval);
    }
}
